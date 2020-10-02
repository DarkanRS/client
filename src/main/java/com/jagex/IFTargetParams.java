package com.jagex;

public class IFTargetParams extends Node {

    static IFTargetParams DEFAULT_SETTINGS = new IFTargetParams(0, -1);
    public int settingsHash;
    public int interfaceId;

    public IFTargetParams(int i_1, int i_2) {
        settingsHash = i_1;
        interfaceId = i_2;
    }

    static int getUseOptionFlags(int settings) {
        return settings >> 11 & 0x7f;
    }

    public boolean dragEnabled() {
        return (settingsHash >> 21 & 0x1) != 0;
    }

    public boolean clickOptionEnabled(int option) {
        return (settingsHash >> option + 1 & 0x1) != 0;
    }

    public int getUseOptionFlags() {
        return IFTargetParams.getUseOptionFlags(settingsHash);
    }

    public int depthFlags() {
        return settingsHash >> 18 & 0x7;
    }

    public boolean bit22Enabled() {
        return (settingsHash >> 22 & 0x1) != 0;
    }

    public boolean continueOptionEnabled() {
        return (settingsHash & 0x1) != 0;
    }

    public boolean bit23Enabled() {
        return (settingsHash >> 23 & 0x1) != 0;
    }

}
