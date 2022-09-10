package com.jagex;

public class IFEvents extends Node {

    static IFEvents DEFAULT_EVENTS = new IFEvents(0, -1);
    public int eventsHash;
    public int targetParam;

    public IFEvents(int settingsHash, int targetParam) {
        this.eventsHash = settingsHash;
        this.targetParam = targetParam;
    }

    static int getUseOptionFlags(int settings) {
        return settings >> 11 & 0x7f;
    }

    public boolean dragEnabled() {
        return (eventsHash >> 21 & 0x1) != 0;
    }

    public boolean clickOptionEnabled(int option) {
        return (eventsHash >> option + 1 & 0x1) != 0;
    }

    public int getUseOptionFlags() {
        return IFEvents.getUseOptionFlags(eventsHash);
    }

    public int depthFlags() {
        return eventsHash >> 18 & 0x7;
    }

    public boolean canBeUsedWith() {
        return (eventsHash >> 22 & 0x1) != 0;
    }

    public boolean continueOptionEnabled() {
        return (eventsHash & 0x1) != 0;
    }

    public boolean ignoresDepthFlags() {
        return (eventsHash >> 23 & 0x1) != 0;
    }

}
