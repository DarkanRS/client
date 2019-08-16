public class NPCMeshModifier {

	public static int MESSAGES;

	public long aLong4993;

	public int[] anIntArray4992;

	public short[] aShortArray4990;

	public short[] aShortArray4991;

	public NPCMeshModifier(long long_1, int[] ints_3, short[] shorts_4, short[] shorts_5) {
		this.aLong4993 = long_1;
		this.anIntArray4992 = ints_3;
		this.aShortArray4990 = shorts_4;
		this.aShortArray4991 = shorts_5;
	}

	public NPCMeshModifier(NPCDefinitions npcdefinitions_1, boolean bool_2) {
		if (bool_2) {
			this.anIntArray4992 = new int[npcdefinitions_1.modelIds.length];
			System.arraycopy(npcdefinitions_1.modelIds, 0, this.anIntArray4992, 0, this.anIntArray4992.length);
		} else {
			this.anIntArray4992 = new int[npcdefinitions_1.headModels.length];
			System.arraycopy(npcdefinitions_1.headModels, 0, this.anIntArray4992, 0, this.anIntArray4992.length);
		}
		if (npcdefinitions_1.modifiedColors != null) {
			this.aShortArray4990 = new short[npcdefinitions_1.modifiedColors.length];
			System.arraycopy(npcdefinitions_1.modifiedColors, 0, this.aShortArray4990, 0, this.aShortArray4990.length);
		}
		if (npcdefinitions_1.modifiedTextures != null) {
			this.aShortArray4991 = new short[npcdefinitions_1.modifiedTextures.length];
			System.arraycopy(npcdefinitions_1.modifiedTextures, 0, this.aShortArray4991, 0, this.aShortArray4991.length);
		}
	}

	public static BillboardDefinitions getBillboardDefinitions(int id) {
		BillboardDefinitions defs = (BillboardDefinitions) BillboardDefinitions.BILLBOARD_CACHE.get((long) id);
		if (defs != null) {
			return defs;
		} else {
			byte[] bytes_3 = BillboardDefinitions.BILLBOARD_INDEX.getFile(0, id);
			defs = new BillboardDefinitions();
			if (bytes_3 != null) {
				defs.decode(new RsByteBuffer(bytes_3), id);
			}
			BillboardDefinitions.BILLBOARD_CACHE.put(defs, (long) id);
			return defs;
		}
	}
}
