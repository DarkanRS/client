public class Class506 {

	static int USE_OPTIONS_FLAGS;

	static Class223 CS2_CACHE = new Class223(128);

	Class506() throws Throwable {
		throw new Error();
	}

	public static MeshModifier decodeItemEffects(ItemDefinitions defs, RsByteBuffer stream) {
		MeshModifier meshModifier = new MeshModifier(defs);
		int flags = stream.readUnsignedByte();
		boolean bodyModels = (flags & 0x1) != 0;
		boolean headModels = (flags & 0x2) != 0;
		boolean colors = (flags & 0x4) != 0;
		boolean textures = (flags & 0x8) != 0;
		if (bodyModels) {
			meshModifier.maleBody[0] = stream.readBigSmart();
			meshModifier.femaleBody[0] = stream.readBigSmart();
			if (defs.maleEquip2 != -1 || defs.femaleEquip2 != -1) {
				meshModifier.maleBody[1] = stream.readBigSmart();
				meshModifier.femaleBody[1] = stream.readBigSmart();
			}
			if (defs.maleEquip3 != -1 || defs.femaleEquip3 != -1) {
				meshModifier.maleBody[2] = stream.readBigSmart();
				meshModifier.femaleBody[2] = stream.readBigSmart();
			}
		}
		if (headModels) {
			meshModifier.maleHeads[0] = stream.readBigSmart();
			meshModifier.femaleHeads[0] = stream.readBigSmart();
			if (defs.maleHead2 != -1 || defs.femaleHead2 != -1) {
				meshModifier.maleHeads[1] = stream.readBigSmart();
				meshModifier.femaleHeads[1] = stream.readBigSmart();
			}
		}
		if (colors) {
			int slotHash = stream.readUnsignedShort();
			int[] slots = new int[] { slotHash & 0xf, slotHash >> 4 & 0xf, slotHash >> 8 & 0xf, slotHash >> 12 & 0xf };
			for (int i = 0; i < 4; i++) {
				if (slots[i] != 15) {
					meshModifier.modifiedColors[slots[i]] = (short) stream.readUnsignedShort();
				}
			}
		}
		if (textures) {
			int slotHash = stream.readUnsignedByte();
			int[] slots = new int[] { slotHash & 0xf, slotHash >> 4 & 0xf };
			for (int i = 0; i < 2; i++) {
				if (slots[i] != 15) {
					meshModifier.modifiedTextures[slots[i]] = (short) stream.readUnsignedShort();
				}
			}
		}
		return meshModifier;
	}
}
