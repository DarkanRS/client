package com.jagex;

public enum MoveSpeed implements Identifiable {
    STATIONARY((byte) -1),
    HALF_WALK((byte) 0),
    WALKING((byte) 1),
    RUNNING((byte) 2);

    public final byte id;

    MoveSpeed(byte b_1) {
        id = b_1;
    }

    @Override
    public int getValue() {
        return id;
    }

    public int getValueIncr() {
        return id + 1;
    }
}
