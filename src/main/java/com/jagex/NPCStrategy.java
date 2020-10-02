package com.jagex;

public class NPCStrategy extends RouteStrategy {

    int anInt7928;

    @Override
    public boolean canExit(int i_1, int i_2, int i_3, ClipFlagMap clipmap_4) {
        return clipmap_4.method5988(i_2, i_3, i_1, approxDestinationX, approxDestinationY, approxDestinationSizeX, approxDestinationSizeY, anInt7928);
    }
}
