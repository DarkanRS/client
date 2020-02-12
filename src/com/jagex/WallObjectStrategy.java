package com.jagex;

public class WallObjectStrategy extends RouteStrategy {

    int anInt7933;
    SceneObjectType aClass458_7934;

    public boolean canExit(int i_1, int i_2, int i_3, ClipMap clipmap_4) {
        return clipmap_4.method5986(i_2, i_3, i_1, this.approxDestinationX, this.approxDestinationY, this.aClass458_7934.getValue(), this.anInt7933, (short) -16585);
    }

}
