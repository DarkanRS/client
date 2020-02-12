package com.jagex;

public class NPCStrategy extends RouteStrategy {

    int anInt7928;

    public boolean canExit(int i_1, int i_2, int i_3, ClipMap clipmap_4) {
        return clipmap_4.method5988(i_2, i_3, i_1, this.approxDestinationX, this.approxDestinationY, this.approxDestinationSizeX, this.approxDestinationSizeY, this.anInt7928, (byte) -6);
    }
}
