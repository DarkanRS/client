package com.jagex;

import java.util.LinkedList;

public class Class337 {

    static LinkedList<MIDIInstrument> aLinkedList3969 = new LinkedList<MIDIInstrument>();

    Class337() throws Throwable {
        throw new Error();
    }

    public static void unloadInterface(int i_0) {
        MapAreaIndexLoader.INTERFACES_LOADED[i_0] = false;
        HostNameIdentifier.clearComponents(i_0);
    }
}
