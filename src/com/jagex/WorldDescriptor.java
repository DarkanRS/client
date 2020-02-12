package com.jagex;

public class WorldDescriptor extends Class217 {

    public int worldNumber;
    public String ipAddress;
    public String unknown;
    public int ping = -1;

    public World getWorld() {
        return Class354.WORLDS[this.worldIndex];
    }

    public static void method13056() {
        Class334.method5940();
    }
}
