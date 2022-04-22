package com.jagex;

public class Class2 {

    Class2() throws Throwable {
        throw new Error();
    }

    public static void method257(String string_0, String string_1) {
        if (string_0.length() <= 320 && Class388.method6693()) {
            HeadbarIndexLoader.method5118();
            Class9.aString99 = string_0;
            Class9.aString102 = string_1;
            GameState.setGameState(GameState.UNK_19);
        }
    }

    public static int method259(int i_0, int i_1, int i_2) {
        i_2 &= 0x3;
        return i_2 == 0 ? i_1 : (i_2 == 1 ? 7 - i_0 : (i_2 == 2 ? 7 - i_1 : i_0));
    }

    static void method263(MIDIInstrument midiInstrumentSound) {
        if (!Class337.linkedListMidiInstruments39.contains(midiInstrumentSound)) {
            Class337.linkedListMidiInstruments39.add(midiInstrumentSound);
        }
    }
}
