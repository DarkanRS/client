package com.rs.jagex;

public class RenderFlagMap {

	public static String aString3643;

	public static int anInt3644;

	public static int decodeLandscapeData(LocationIndexLoader objectindexloader_0, byte[] bytes_1, int i_2, int i_3, int i_4, int i_5) {
		int i_7 = 0;
		ByteBuf rsbytebuffer_8 = new ByteBuf(bytes_1);
		int i_9 = -1;
		label56:
			while (true) {
				int i_10 = rsbytebuffer_8.readSum();
				if (i_10 == 0)
					return i_7;
				i_9 += i_10;
				int i_11 = 0;
				boolean bool_12 = false;
				while (true) {
					int i_13;
					while (!bool_12) {
						i_13 = rsbytebuffer_8.readSmart();
						if (i_13 == 0)
							continue label56;
						i_11 += i_13 - 1;
						int i_14 = i_11 & 0x3f;
						int i_15 = i_11 >> 6 & 0x3f;
						int i_16 = rsbytebuffer_8.readUnsignedByte() >> 2;
						int i_17 = i_15 + i_2;
						int i_18 = i_3 + i_14;
						if (i_17 > 0 && i_18 > 0 && i_17 < i_4 - 1 && i_18 < i_5 - 1) {
							ObjectDefinition objectdefinitions_19 = objectindexloader_0.getObjectDefs(i_9);
							if (i_16 != ObjectType.GROUND_DECORATION.id || Class393.preferences.groundDecor.method12897() != 0 || objectdefinitions_19.interactable != 0 || objectdefinitions_19.clipType == 1 || objectdefinitions_19.obstructsGround) {
								if (!objectdefinitions_19.method7968())
									++i_7;
								bool_12 = true;
							}
						}
					}
					i_13 = rsbytebuffer_8.readSmart();
					if (i_13 == 0)
						break;
					rsbytebuffer_8.readUnsignedByte();
				}
			}
	}

	public byte[][][] tileMasks;

	public RenderFlagMap(int i_2, int i_3) {
		tileMasks = new byte[4][i_2][i_3];
	}

	public boolean isLowerObjectsToOverrideClipping(int i_1, int i_2) {
		return (i_1 >= 0 && i_2 >= 0 && i_1 < tileMasks[1].length && i_2 < tileMasks[1][i_1].length) && (tileMasks[1][i_1][i_2] & 0x2) != 0;
	}

	public boolean method5498(int i_1, int i_2, int i_3, int i_4) {
		return (tileMasks[0][i_3][i_4] & 0x2) != 0 || ((tileMasks[i_2][i_3][i_4] & 0x10) == 0 && method5499(i_2, i_3, i_4) == i_1);
	}

	int method5499(int i_1, int i_2, int i_3) {
		return (tileMasks[i_1][i_2][i_3] & 0x8) != 0 ? 0 : (i_1 > 0 && (tileMasks[1][i_2][i_3] & 0x2) != 0 ? i_1 - 1 : i_1);
	}

	public void reset() {
		for (int i_2 = 0; i_2 < tileMasks.length; i_2++)
			for (int i_3 = 0; i_3 < tileMasks[0].length; i_3++)
				for (int i_4 = 0; i_4 < tileMasks[0][0].length; i_4++)
					tileMasks[i_2][i_3][i_4] = 0;
	}
}
