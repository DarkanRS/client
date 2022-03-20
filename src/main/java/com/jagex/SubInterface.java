package com.jagex;

import com.Loader;

public class SubInterface extends Node {

    public static int CAM_MOVE_LOCALY;
    public static Loader suppliedApplet;
    public int interfaceId;
    public int overlay;

    public SubInterface(int i_1, int i_2) {
        interfaceId = i_1;
        overlay = i_2;
    }

    public boolean load() {
        return true;
    }
}
