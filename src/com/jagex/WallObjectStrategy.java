package com.jagex;

public class WallObjectStrategy extends RouteStrategy {

    int anInt7933;
    LocShapes aClass458_7934;

    @Override
    public boolean canExit(int i_1, int i_2, int i_3, ClipMap clipmap_4) {
        return clipmap_4.method5986(i_2, i_3, i_1, approxDestinationX, approxDestinationY, aClass458_7934.getValue(), anInt7933);
    }

}
