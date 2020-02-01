package com.jagex;
import java.util.Iterator;

public class MeshModifier {

	protected static Class267 aClass267_5026;
	public int[] maleBody = new int[3];
	public int[] femaleBody = new int[3];
	public int[] maleHeads = new int[2];
	public int[] femaleHeads = new int[2];
	public short[] modifiedColors;
	public short[] modifiedTextures;
	
	MeshModifier(ItemDefinitions defs) {
		this.maleBody[0] = defs.maleEquip1;
		this.maleBody[1] = defs.maleEquip2;
		this.maleBody[2] = defs.maleEquip3;
		this.femaleBody[0] = defs.femaleEquip1;
		this.femaleBody[1] = defs.femaleEquip2;
		this.femaleBody[2] = defs.femaleEquip3;
		this.maleHeads[0] = defs.maleHead1;
		this.maleHeads[1] = defs.maleHead2;
		this.femaleHeads[0] = defs.femaleHead1;
		this.femaleHeads[1] = defs.femaleHead2;
		if (defs.modifiedModelColors != null) {
			this.modifiedColors = new short[defs.modifiedModelColors.length];
			System.arraycopy(defs.modifiedModelColors, 0, this.modifiedColors, 0, this.modifiedColors.length);
		}
		if (defs.modifiedTextureIds != null) {
			this.modifiedTextures = new short[defs.modifiedTextureIds.length];
			System.arraycopy(defs.modifiedTextureIds, 0, this.modifiedTextures, 0, this.modifiedTextures.length);
		}
	}

	public static void method7041(byte b_0) {
		CustomCursorsPreference.INTERFACES = new RSInterface[Class388.INTERFACE_INDEX.containersCount()];
		MapAreaIndexLoader.INTERFACES_LOADED = new boolean[Class388.INTERFACE_INDEX.containersCount()];
	}

	public static void method7042() {
		int i_1 = Class337.aLinkedList3969.size();
		Iterator iterator_2 = Class337.aLinkedList3969.iterator();
		while (iterator_2.hasNext()) {
			MIDIInstrument class282_sub18_3 = (MIDIInstrument) iterator_2.next();
			class282_sub18_3.method12296(class282_sub18_3.method12275() + class282_sub18_3.method12277() / (2 * i_1));
			if (!class282_sub18_3.method12276()) {
				iterator_2.remove();
			}
		}
	}
}
