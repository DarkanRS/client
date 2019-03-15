public class Class506 {

	static int anInt5858;

	static Class223 aClass223_5857 = new Class223(128);

	Class506() throws Throwable {
		throw new Error();
	}

	public static MeshModifier decodeItemEffects(ItemDefinitions itemdefinitions_0, RsByteBuffer rsbytebuffer_1) {
		MeshModifier meshmodifier_3 = new MeshModifier(itemdefinitions_0);
		int i_4 = rsbytebuffer_1.readUnsignedByte();
		boolean bool_5 = (i_4 & 0x1) != 0;
		boolean bool_6 = (i_4 & 0x2) != 0;
		boolean bool_7 = (i_4 & 0x4) != 0;
		boolean bool_8 = (i_4 & 0x8) != 0;
		if (bool_5) {
			meshmodifier_3.maleBody[0] = rsbytebuffer_1.readBigSmart();
			meshmodifier_3.femaleBody[0] = rsbytebuffer_1.readBigSmart();
			if (itemdefinitions_0.maleEquip2 != -1 || itemdefinitions_0.femaleEquip2 != -1) {
				meshmodifier_3.maleBody[1] = rsbytebuffer_1.readBigSmart();
				meshmodifier_3.femaleBody[1] = rsbytebuffer_1.readBigSmart();
			}
			if (itemdefinitions_0.maleEquip3 != -1 || itemdefinitions_0.femaleEquip3 != -1) {
				meshmodifier_3.maleBody[2] = rsbytebuffer_1.readBigSmart();
				meshmodifier_3.femaleBody[2] = rsbytebuffer_1.readBigSmart();
			}
		}
		if (bool_6) {
			meshmodifier_3.maleHeads[0] = rsbytebuffer_1.readBigSmart();
			meshmodifier_3.femaleHeads[0] = rsbytebuffer_1.readBigSmart();
			if (itemdefinitions_0.maleHead2 != -1 || itemdefinitions_0.femaleHead2 != -1) {
				meshmodifier_3.maleHeads[1] = rsbytebuffer_1.readBigSmart();
				meshmodifier_3.femaleHeads[1] = rsbytebuffer_1.readBigSmart();
			}
		}
		int i_9;
		int[] ints_10;
		int i_11;
		if (bool_7) {
			i_9 = rsbytebuffer_1.readUnsignedShort();
			ints_10 = new int[] { i_9 & 0xf, i_9 >> 4 & 0xf, i_9 >> 8 & 0xf, i_9 >> 12 & 0xf };
			for (i_11 = 0; i_11 < 4; i_11++) {
				if (ints_10[i_11] != 15) {
					meshmodifier_3.modifiedColors[ints_10[i_11]] = (short) rsbytebuffer_1.readUnsignedShort();
				}
			}
		}
		if (bool_8) {
			i_9 = rsbytebuffer_1.readUnsignedByte();
			ints_10 = new int[] { i_9 & 0xf, i_9 >> 4 & 0xf };
			for (i_11 = 0; i_11 < 2; i_11++) {
				if (ints_10[i_11] != 15) {
					meshmodifier_3.modifiedTextures[ints_10[i_11]] = (short) rsbytebuffer_1.readUnsignedShort();
				}
			}
		}
		return meshmodifier_3;
	}
}
