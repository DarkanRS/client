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
        Interface.INTERFACES = new Interface[Class388.INTERFACE_INDEX.containersCount()];
        MapAreaIndexLoader.INTERFACES_LOADED = new boolean[Class388.INTERFACE_INDEX.containersCount()];
    }

    public static void method7042() {
        int size = Class337.linkedListMidiInstruments39.size();
        Iterator<MIDIInstrument> itMidiInstruments = Class337.linkedListMidiInstruments39.iterator();
        while (itMidiInstruments.hasNext()) {
            MIDIInstrument midiInstrumentSound = itMidiInstruments.next();
            midiInstrumentSound.method12296(midiInstrumentSound.method12275() + midiInstrumentSound.getHertz() / (2 * size));
            if (!midiInstrumentSound.method12276()) {
                itMidiInstruments.remove();
            }
        }
    }
}
