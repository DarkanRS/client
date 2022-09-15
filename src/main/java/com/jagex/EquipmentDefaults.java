package com.jagex;

public class EquipmentDefaults {

	public static void method11248() {
		Class393.preferences.setValue(Class393.preferences.removeRoofs, 2);
		Class393.preferences.setValue(Class393.preferences.removeRoofsOptionOverride, 2);
		Class393.preferences.setValue(Class393.preferences.groundDecor, 1);
		Class393.preferences.setValue(Class393.preferences.groundBlending, 1);
		Class393.preferences.setValue(Class393.preferences.idleAnimations, 1);
		Class393.preferences.setValue(Class393.preferences.flickeringEffects, 1);
		Class393.preferences.setValue(Class393.preferences.characterShadows, 1);
		Class393.preferences.setValue(Class393.preferences.textures, 1);
		Class393.preferences.setValue(Class393.preferences.sceneryShadows, 2);
		Class393.preferences.setValue(Class393.preferences.lightDetail, 1);
		Class393.preferences.setValue(Class393.preferences.water, 2);
		Class393.preferences.setValue(Class393.preferences.fog, 1);
		Class393.preferences.setValue(Class393.preferences.antiAliasingDefault, 0);
		Class393.preferences.setValue(Class393.preferences.aPreference_Sub4_8223, 0);
		Class393.preferences.setValue(Class393.preferences.particles, 2);
		Class393.preferences.setValue(Class393.preferences.buildArea, MapSize.SIZE_104.index);
		Class393.preferences.setValue(Class393.preferences.bloom, 0);
		Class393.preferences.setValue(Class393.preferences.skyBoxes, 1);
		ImageIndexLoader.method5777();
		Class393.preferences.setValue(Class393.preferences.maxScreenSize, 0);
		Class393.preferences.setValue(Class393.preferences.graphics, 4);
		Class94.method1589();
		IndexLoaders.MAP_REGION_DECODER.method4435().method4048();
		client.aBool7185 = true;
	}
	public int[] hidden;
	public int offhandSlot = -1;
	public int weaponSlot = -1;
	public int[] hiddenAnimationOffhandSlots;

	public int[] hiddenAnimationWeaponSlots;

	public EquipmentDefaults(Index index_1) {
		byte[] bytes_2 = index_1.getFile(DefaultsFile.EQUIPMENT.fileId);
		decode(new ByteBuf(bytes_2));
		if (hidden == null)
			throw new RuntimeException("");
	}

	void decode(ByteBuf buffer) {
		while (true) {
			int opcode = buffer.readUnsignedByte();
			if (opcode == 0)
				return;
			if (opcode == 1) {
				int count = buffer.readUnsignedByte();
				hidden = new int[count];
				for (int i_5 = 0; i_5 < hidden.length; i_5++) {
					hidden[i_5] = buffer.readUnsignedByte();
					if (hidden[i_5] != 0) {
						//int i_10000 = this.equipmentSlots[i_5];
					}
				}
			} else if (opcode == 3)
				offhandSlot = buffer.readUnsignedByte();
			else if (opcode == 4)
				weaponSlot = buffer.readUnsignedByte();
			else if (opcode == 5) {
				hiddenAnimationOffhandSlots = new int[buffer.readUnsignedByte()];
				for (int i_4 = 0; i_4 < hiddenAnimationOffhandSlots.length; i_4++)
					hiddenAnimationOffhandSlots[i_4] = buffer.readUnsignedByte();
			} else if (opcode == 6) {
				hiddenAnimationWeaponSlots = new int[buffer.readUnsignedByte()];
				for (int i_4 = 0; i_4 < hiddenAnimationWeaponSlots.length; i_4++)
					hiddenAnimationWeaponSlots[i_4] = buffer.readUnsignedByte();
			}
		}
	}
}
