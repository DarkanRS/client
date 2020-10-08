package com.jagex;

public enum ClipFlag {
    EMPTY(0xFFFFFFFF), // -1

    NW_OBJ(0x1), // 1
    N_OBJ(0x2), // 2
    NE_OBJ(0x4), // 4
    E_OBJ(0x8), // 8
    SE_OBJ(0x10), // 16
    S_OBJ(0x20), // 32
    SW_OBJ(0x40), // 64
    W_OBJ(0x80), // 128
    OBJ(0x100), // 256

    NW_BOUND(0x200), // 512
    N_BOUND(0x400), // 1024
    NE_BOUND(0x800), // 2048
    E_BOUND(0x1000), // 4096
    SE_BOUND(0x2000), // 8192
    S_BOUND(0x4000), // 16384
    SW_BOUND(0x8000), // 32768
    W_BOUND(0x10000), // 65536

    BLOCKED_OBJ(0x20000), // 131072
    BLOCKED_DECO(0x40000), // 262144
    BLOCKED(0x200000), // 2097152

    NW_ALT_OBJ(0x400000), // 4194304
    N_ALT_OBJ(0x800000), // 8388608
    NE_ALT_OBJ(0x1000000), // 16777216
    E_ALT_OBJ(0x2000000), // 33554432
    SE_ALT_OBJ(0x4000000), // 67108864
    S_ALT_OBJ(0x8000000), // 134217728
    SW_ALT_OBJ(0x10000000), // 268435456
    W_ALT_OBJ(0x20000000), // 536870912
    ALT_OBJ(0x40000000); // 1073741824

    public final int flag;

    ClipFlag(int flag) {
        this.flag = flag;
    }
}
