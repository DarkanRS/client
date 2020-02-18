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
        maleBody[0] = defs.maleEquip1;
        maleBody[1] = defs.maleEquip2;
        maleBody[2] = defs.maleEquip3;
        femaleBody[0] = defs.femaleEquip1;
        femaleBody[1] = defs.femaleEquip2;
        femaleBody[2] = defs.femaleEquip3;
        maleHeads[0] = defs.maleHead1;
        maleHeads[1] = defs.maleHead2;
        femaleHeads[0] = defs.femaleHead1;
        femaleHeads[1] = defs.femaleHead2;
        if (defs.modifiedModelColors != null) {
            modifiedColors = new short[defs.modifiedModelColors.length];
            System.arraycopy(defs.modifiedModelColors, 0, modifiedColors, 0, modifiedColors.length);
        }
        if (defs.modifiedTextureIds != null) {
            modifiedTextures = new short[defs.modifiedTextureIds.length];
            System.arraycopy(defs.modifiedTextureIds, 0, modifiedTextures, 0, modifiedTextures.length);
        }
    }

    public static void method7041() {
        CustomCursorsPreference.INTERFACES = new Interface[Class388.INTERFACE_INDEX.containersCount()];
        MapAreaIndexLoader.INTERFACES_LOADED = new boolean[Class388.INTERFACE_INDEX.containersCount()];
    }

    public static void method7042() {
        int i_1 = Class337.aLinkedList3969.size();
        Iterator<MIDIInstrument> iterator_2 = Class337.aLinkedList3969.iterator();
        while (iterator_2.hasNext()) {
            MIDIInstrument class282_sub18_3 = iterator_2.next();
            class282_sub18_3.method12296(class282_sub18_3.method12275() + class282_sub18_3.method12277() / (2 * i_1));
            if (!class282_sub18_3.method12276()) {
                iterator_2.remove();
            }
        }
    }
}
