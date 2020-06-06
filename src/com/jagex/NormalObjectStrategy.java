package com.jagex;

public class NormalObjectStrategy extends RouteStrategy {

    int accessFlags;
    ObjectType objectType;

    @Override
    public boolean canExit(int size, int x, int y, ClipMap clipmap_4) {
        return clipmap_4.reachedObject(x, y, size, approxDestinationX, approxDestinationY, objectType.getValue(), accessFlags);
    }
}
