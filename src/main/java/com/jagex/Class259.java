package com.jagex;

public class Class259 {

    int anInt3213;
    int anInt3214;
    int[] anIntArray3215;
    int[] anIntArray3216;

    Class259() {
        MIDIInstrument.method12264(16);
        anInt3213 = MIDIInstrument.method12263() != 0 ? MIDIInstrument.method12264(4) + 1 : 1;
        if (MIDIInstrument.method12263() != 0) {
            MIDIInstrument.method12264(8);
        }

        MIDIInstrument.method12264(2);
        if (anInt3213 > 1) {
            anInt3214 = MIDIInstrument.method12264(4);
        }

        anIntArray3215 = new int[anInt3213];
        anIntArray3216 = new int[anInt3213];

        for (int i_1 = 0; i_1 < anInt3213; i_1++) {
            MIDIInstrument.method12264(8);
            anIntArray3215[i_1] = MIDIInstrument.method12264(8);
            anIntArray3216[i_1] = MIDIInstrument.method12264(8);
        }

    }

}
