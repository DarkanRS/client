package com.jagex;

public class ParticleTriangle {
    int anInt2884;
    int anInt2885;
    int anInt2886;
    int centerZ;
    int anInt2888;
    int anInt2889;
    int anInt2890;
    int anInt2891;
    int centerY;
    int anInt2893;
    int centerX;
    int anInt2895;

    public static void method3953() {
        Class86.aShort828 = client.aShort7214;
        Class86.aShort829 = client.aShort7474;
        Class534.aShort7079 = client.aShort7276;
        Class86.aShort830 = client.aShort7441;
        Class86.aBool826 = true;
        if (Class86.anInt824 != 0 && Class86.anInt825 != 0) {
            client.aShort7276 = 334;
            client.aShort7441 = 334;
            client.aShort7474 = client.aShort7214 = (short) (Class86.anInt824 * 512 / Class86.anInt825);
        }
    }

    boolean equals(ParticleTriangle class234_1) {
        return centerX == class234_1.centerX && centerZ == class234_1.centerZ && centerY == class234_1.centerY;
    }
}
