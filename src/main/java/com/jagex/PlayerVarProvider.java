package com.jagex;

public class PlayerVarProvider implements VarProvider {

    static int[] BIT_MASKS = new int[32];

    static {
        int i_0 = 2;
        for (int i_1 = 0; i_1 < 32; i_1++) {
            BIT_MASKS[i_1] = i_0 - 1;
            i_0 += i_0;
        }
    }

    public int[] vars;
    IterableNodeMap aClass465_28 = new IterableNodeMap(128);
    int[] anIntArray25;

    public PlayerVarProvider() {
        anIntArray25 = new int[IndexLoaders.VAR_LOADER.size];
        vars = new int[IndexLoaders.VAR_LOADER.size];
    }

    public static int method282(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5) {
        int i_31 = i_3;
        int i_41 = i_4;
        if ((i_5 & 0x1) == 1) {
            int i_7 = i_31;
            i_31 = i_41;
            i_41 = i_7;
        }
        i_2 &= 0x3;
        return i_2 == 0 ? i_1 : (i_2 == 1 ? 7 - i_0 - (i_31 - 1) : (i_2 == 2 ? 7 - i_1 - (i_41 - 1) : i_0));
    }

    public static int method285(int i_0, int i_1) {
        int i_3;
        for (i_3 = 0; i_1 > 0; --i_1) {
            i_3 = i_3 << 1 | i_0 & 0x1;
            i_0 >>>= 1;
        }
        return i_3;
    }

    static EntityNode_Sub2 method286() {
        EntityNode_Sub2 class275_sub2_1 = (EntityNode_Sub2) EntityNode_Sub2.aClass457_7745.method7648();
        if (class275_sub2_1 != null) {
            --EntityNode_Sub2.anInt7741;
            return class275_sub2_1;
        } else {
            return new EntityNode_Sub2();
        }
    }

    @Override
    public int method242(int i_1) {
        VarBitDefinitions class226_2 = IndexLoaders.VARBIT_LOADER.getVarBit(i_1);
        int i_3 = -1764754967 * class226_2.baseVar * -1882165671;
        int i_4 = -1174362995 * class226_2.startBit * -1187004859;
        int i_5 = class226_2.endBit * -1434404187 * -188179155;
        int i_6 = BIT_MASKS[i_5 - i_4];
        return vars[i_3] >> i_4 & i_6;
    }

    int poll(boolean bool_1) {
        long long_3 = Utils.time();
        for (LongNode class282_sub45_5 = (LongNode) (bool_1 ? aClass465_28.method7750() : aClass465_28.method7751()); class282_sub45_5 != null; class282_sub45_5 = (LongNode) aClass465_28.method7751()) {
            if ((class282_sub45_5.aLong8066 & 0x3fffffffffffffffL) < long_3) {
                if ((class282_sub45_5.aLong8066 & 0x4000000000000000L) != 0L) {
                    int i_6 = (int) class282_sub45_5.pointer;
                    vars[i_6] = anIntArray25[i_6];
                    class282_sub45_5.unlink();
                    return i_6;
                }
                class282_sub45_5.unlink();
            }
        }
        return -1;
    }

    void method265() {
        for (int i_2 = 0; i_2 < IndexLoaders.VAR_LOADER.size; i_2++) {
            anIntArray25[i_2] = 0;
            vars[i_2] = 0;
        }
        aClass465_28 = new IterableNodeMap(128);
    }

    public void method266(int i_1, int i_2) {
        vars[i_1] = i_2;
        LongNode class282_sub45_4 = (LongNode) aClass465_28.get(i_1);
        if (class282_sub45_4 != null) {
            class282_sub45_4.aLong8066 = Utils.time() + 500L;
        } else {
            class282_sub45_4 = new LongNode(Utils.time() + 500L);
            aClass465_28.put(class282_sub45_4, i_1);
        }
    }

    @Override
    public int method236(int i_1) {
        return vars[i_1];
    }

    void method268(int i_1, int i_2) {
        int i_21 = i_2;
        VarBitDefinitions varbit = IndexLoaders.VARBIT_LOADER.getVarBit(i_1);
        int i_5 = varbit.baseVar;
        int i_6 = varbit.startBit;
        int i_7 = varbit.endBit;
        int i_8 = BIT_MASKS[i_7 - i_6];
        if (i_21 < 0 || i_21 > i_8) {
            i_21 = 0;
        }
        i_8 <<= i_6;
        setVarp(i_5, anIntArray25[i_5] & ~i_8 | i_21 << i_6 & i_8);
    }

    @Override
    public int getVarBit(int i_1) {
        VarBitDefinitions class226_3 = IndexLoaders.VARBIT_LOADER.getVarBit(i_1);
        int varId = class226_3.baseVar;
        int start = class226_3.startBit;
        int end = class226_3.endBit;
        int mask = BIT_MASKS[end - start];
        return vars[varId] >> start & mask;
    }

    @Override
    public int method238(int i_1) {
        return vars[i_1];
    }

    public void method280(int i_1, int i_2) {
        int i_21 = i_2;
        VarBitDefinitions class226_4 = IndexLoaders.VARBIT_LOADER.getVarBit(i_1);
        int i_5 = class226_4.baseVar;
        int i_6 = class226_4.startBit;
        int i_7 = class226_4.endBit;
        int i_8 = BIT_MASKS[i_7 - i_6];
        if (i_21 < 0 || i_21 > i_8) {
            i_21 = 0;
        }
        i_8 <<= i_6;
        method266(i_5, vars[i_5] & ~i_8 | i_21 << i_6 & i_8);
    }

    @Override
    public int method239(int i_1) {
        return vars[i_1];
    }

    @Override
    public int method237(int i_1) {
        return vars[i_1];
    }

    @Override
    public int getVar(int i_1) {
        return vars[i_1];
    }

    void setVarp(int i_1, int i_2) {
        anIntArray25[i_1] = i_2;
        LongNode class282_sub45_4 = (LongNode) aClass465_28.get(i_1);
        if (class282_sub45_4 != null) {
            if (class282_sub45_4.aLong8066 != 4611686018427387905L) {
                class282_sub45_4.aLong8066 = Utils.time() + 500L | 0x4000000000000000L;
            }
        } else {
            class282_sub45_4 = new LongNode(4611686018427387905L);
            aClass465_28.put(class282_sub45_4, i_1);
        }
    }
}
