package com.jagex;

public class Node_Sub15_Sub1 extends AbstractSoundNode_0 {

    static int anInt9575;
    static Class321 aClass321_9573;

    static {
        aClass321_9573 = new Class321(Class332.aClass332_3875);
    }

    boolean aBool9571;
    int anInt9570;
    int anInt9569;
    NodeCollection aClass482_9568 = new NodeCollection();
    int anInt9565 = 256;
    int anInt9572 = 256;
    int anInt9567;
    boolean aBool9574;

    Node_Sub15_Sub1(int i_1) {
        anInt9567 = i_1;
    }

    static Game[] method14817() {
        return new Game[]{Game.aClass486_5745, Game.aClass486_5743, Game.stellarDawn, Game.aClass486_5747, Game.darkan};
    }

    public static void method14840() {
        Engine.FPS_MANAGER.method4853();
        int i_1;
        for (i_1 = 0; i_1 < 32; i_1++) {
            Engine.aLongArray3246[i_1] = 0L;
        }
        for (i_1 = 0; i_1 < 32; i_1++) {
            Engine.PULSE_TIMES[i_1] = 0L;
        }
        Engine.LOGIC_PULSES_TO_PROCESS = 0;
    }

    synchronized void method14808() {
        aBool9571 = true;
    }

    @Override
    synchronized void method12230(int[] ints_1, int i_2, int i_3) {
        if (!aBool9574) {
            if (method14812() == null) {
                if (aBool9571) {
                    unlink();
                    aClass321_9573.method5744();
                }
            } else {
                int i_4 = i_3 + i_2;
                if (Class253.isStereo) {
                    i_4 <<= 1;
                }
                byte b_5 = 0;
                byte b_6 = 0;
                if (anInt9567 == 2) {
                    b_6 = 1;
                }
                while (i_2 < i_4) {
                    Node_Sub39 class282_sub39_7 = method14812();
                    if (class282_sub39_7 == null) {
                        break;
                    }
                    short[][] shorts_8;
                    for (shorts_8 = class282_sub39_7.aShortArrayArray8003; i_2 < i_4 && anInt9570 < shorts_8[0].length; anInt9570++) {
                        if (Class253.isStereo) {
                            ints_1[i_2++] = shorts_8[b_5][anInt9570] * anInt9565;
                            ints_1[i_2++] = shorts_8[b_6][anInt9570] * anInt9572;
                        } else {
                            int i_10001 = i_2++;
                            ints_1[i_10001] += shorts_8[b_6][anInt9570] * anInt9572 + shorts_8[b_5][anInt9570] * anInt9565;
                        }
                    }
                    if (anInt9570 >= shorts_8[0].length) {
                        method14813();
                    }
                }
            }
        }
    }

    synchronized int method14811() {
        return anInt9569;
    }

    synchronized Node_Sub39 method14812() {
        return (Node_Sub39) aClass482_9568.head();
    }

    synchronized void method14813() {
        Node_Sub39 class282_sub39_2 = method14812();
        if (class282_sub39_2 != null) {
            class282_sub39_2.unlink();
            anInt9570 = 0;
            --anInt9569;
            aClass321_9573.method5740(Long.valueOf(class282_sub39_2.method13294()), class282_sub39_2);
        }
    }

    Node_Sub39 method14814(int i_1, double d_2) {
        long long_4 = anInt9567 << 0 | i_1;
        Node_Sub39 class282_sub39_6 = aClass321_9573.method5739(Long.valueOf(long_4));
        if (class282_sub39_6 != null) {
            class282_sub39_6.aDouble8004 = d_2;
            aClass321_9573.method5737(Long.valueOf(long_4));
        } else {
            class282_sub39_6 = new Node_Sub39(new short[anInt9567][i_1], d_2);
        }
        return class282_sub39_6;
    }

    synchronized void method14815(Node_Sub39 class282_sub39_1) {
        while (anInt9569 >= 100) {
            aClass482_9568.popHead();
            --anInt9569;
        }
        aClass482_9568.append(class282_sub39_1);
        ++anInt9569;
    }

    @Override
    int method12244() {
        return 1;
    }

    synchronized void method14816(boolean bool_1) {
        aBool9574 = bool_1;
    }

    @Override
    int method12228() {
        return 1;
    }

    @Override
    synchronized void method12231(int i_1) {
        if (!aBool9574) {
            while (true) {
                Node_Sub39 class282_sub39_2 = method14812();
                if (class282_sub39_2 == null) {
                    if (aBool9571) {
                        unlink();
                        aClass321_9573.method5744();
                    }
                    break;
                }
                if (class282_sub39_2.aShortArrayArray8003[0].length - anInt9570 > i_1) {
                    anInt9570 += i_1;
                    break;
                }
                i_1 -= class282_sub39_2.aShortArrayArray8003[0].length - anInt9570;
                method14813();
            }
        }
    }

    @Override
    synchronized void method12242(int[] ints_1, int i_2, int i_3) {
        if (!aBool9574) {
            if (method14812() == null) {
                if (aBool9571) {
                    unlink();
                    aClass321_9573.method5744();
                }
            } else {
                int i_4 = i_2 + i_3;
                if (Class253.isStereo) {
                    i_4 <<= 1;
                }
                byte b_5 = 0;
                byte b_6 = 0;
                if (1508954819 * anInt9567 * 586214891 == 2) {
                    b_6 = 1;
                }
                while (i_2 < i_4) {
                    Node_Sub39 class282_sub39_7 = method14812();
                    if (class282_sub39_7 == null) {
                        break;
                    }
                    short[][] shorts_8;
                    for (shorts_8 = class282_sub39_7.aShortArrayArray8003; i_2 < i_4 && anInt9570 * -235363691 * -1326835523 < shorts_8[0].length; anInt9570 = (anInt9570 * -235363691 + -235363691) * -1326835523) {
                        if (Class253.isStereo) {
                            ints_1[i_2++] = anInt9565 * 299218013 * 1644019701 * shorts_8[b_5][-1326835523 * anInt9570 * -235363691];
                            ints_1[i_2++] = shorts_8[b_6][-1326835523 * anInt9570 * -235363691] * -1731402595 * anInt9572 * 1802027445;
                        } else {
                            int i_10001 = i_2++;
                            ints_1[i_10001] += shorts_8[b_6][-1326835523 * anInt9570 * -235363691] * anInt9572 * 1802027445 * -1731402595 + shorts_8[b_5][anInt9570 * -235363691 * -1326835523] * anInt9565 * 299218013 * 1644019701;
                        }
                    }
                    if (-1326835523 * anInt9570 * -235363691 >= shorts_8[0].length) {
                        method14813();
                    }
                }
            }
        }
    }

    @Override
	AbstractSoundNode_0 method12232() {
        return null;
    }

    @Override
	AbstractSoundNode_0 method12233() {
        return null;
    }

    @Override
	AbstractSoundNode_0 method12229() {
        return null;
    }

    @Override
	AbstractSoundNode_0 method12235() {
        return null;
    }

    @Override
	AbstractSoundNode_0 method12236() {
        return null;
    }

    @Override
    int method12224() {
        return 1;
    }

    @Override
    int method12238() {
        return 1;
    }

    @Override
    synchronized void method12240(int[] ints_1, int i_2, int i_3) {
        if (!aBool9574) {
            if (method14812() == null) {
                if (aBool9571) {
                    unlink();
                    aClass321_9573.method5744();
                }
            } else {
                int i_4 = i_2 + i_3;
                if (Class253.isStereo) {
                    i_4 <<= 1;
                }
                byte b_5 = 0;
                byte b_6 = 0;
                if (1508954819 * anInt9567 * 586214891 == 2) {
                    b_6 = 1;
                }
                while (i_2 < i_4) {
                    Node_Sub39 class282_sub39_7 = method14812();
                    if (class282_sub39_7 == null) {
                        break;
                    }
                    short[][] shorts_8;
                    for (shorts_8 = class282_sub39_7.aShortArrayArray8003; i_2 < i_4 && anInt9570 * -235363691 * -1326835523 < shorts_8[0].length; anInt9570 = (anInt9570 * -235363691 + -235363691) * -1326835523) {
                        if (Class253.isStereo) {
                            ints_1[i_2++] = anInt9565 * 299218013 * 1644019701 * shorts_8[b_5][-1326835523 * anInt9570 * -235363691];
                            ints_1[i_2++] = shorts_8[b_6][-1326835523 * anInt9570 * -235363691] * -1731402595 * anInt9572 * 1802027445;
                        } else {
                            int i_10001 = i_2++;
                            ints_1[i_10001] += shorts_8[b_6][-1326835523 * anInt9570 * -235363691] * anInt9572 * 1802027445 * -1731402595 + shorts_8[b_5][anInt9570 * -235363691 * -1326835523] * anInt9565 * 299218013 * 1644019701;
                        }
                    }
                    if (-1326835523 * anInt9570 * -235363691 >= shorts_8[0].length) {
                        method14813();
                    }
                }
            }
        }
    }

    @Override
    synchronized void method12241(int[] ints_1, int i_2, int i_3) {
        if (!aBool9574) {
            if (method14812() == null) {
                if (aBool9571) {
                    unlink();
                    aClass321_9573.method5744();
                }
            } else {
                int i_4 = i_2 + i_3;
                if (Class253.isStereo) {
                    i_4 <<= 1;
                }
                byte b_5 = 0;
                byte b_6 = 0;
                if (1508954819 * anInt9567 * 586214891 == 2) {
                    b_6 = 1;
                }
                while (i_2 < i_4) {
                    Node_Sub39 class282_sub39_7 = method14812();
                    if (class282_sub39_7 == null) {
                        break;
                    }
                    short[][] shorts_8;
                    for (shorts_8 = class282_sub39_7.aShortArrayArray8003; i_2 < i_4 && anInt9570 * -235363691 * -1326835523 < shorts_8[0].length; anInt9570 = (anInt9570 * -235363691 + -235363691) * -1326835523) {
                        if (Class253.isStereo) {
                            ints_1[i_2++] = anInt9565 * 299218013 * 1644019701 * shorts_8[b_5][-1326835523 * anInt9570 * -235363691];
                            ints_1[i_2++] = shorts_8[b_6][-1326835523 * anInt9570 * -235363691] * -1731402595 * anInt9572 * 1802027445;
                        } else {
                            int i_10001 = i_2++;
                            ints_1[i_10001] += shorts_8[b_6][-1326835523 * anInt9570 * -235363691] * anInt9572 * 1802027445 * -1731402595 + shorts_8[b_5][anInt9570 * -235363691 * -1326835523] * anInt9565 * 299218013 * 1644019701;
                        }
                    }
                    if (-1326835523 * anInt9570 * -235363691 >= shorts_8[0].length) {
                        method14813();
                    }
                }
            }
        }
    }

    synchronized double method14819() {
        if (anInt9569 < 1) {
            return -1.0;
        } else {
            Node_Sub39 class282_sub39_2 = (Node_Sub39) aClass482_9568.head();
            return class282_sub39_2 == null ? -1.0 : class282_sub39_2.aDouble8004 - ((float) class282_sub39_2.aShortArrayArray8003[0].length / Class253.hertz);
        }
    }

    public void method14820(int i_1) {
        anInt9565 = i_1;
        anInt9572 = i_1;
    }

    @Override
    synchronized void method12234(int i_1) {
        if (!aBool9574) {
            while (true) {
                Node_Sub39 class282_sub39_2 = method14812();
                if (class282_sub39_2 == null) {
                    if (aBool9571) {
                        unlink();
                        aClass321_9573.method5744();
                    }
                    break;
                }
                if (class282_sub39_2.aShortArrayArray8003[0].length - anInt9570 * -235363691 * -1326835523 > i_1) {
                    anInt9570 = (anInt9570 * -235363691 + i_1 * -235363691) * -1326835523;
                    break;
                }
                i_1 -= class282_sub39_2.aShortArrayArray8003[0].length - anInt9570 * -235363691 * -1326835523;
                method14813();
            }
        }
    }

    @Override
    int method12227() {
        return 1;
    }

    @Override
	AbstractSoundNode_0 method12239() {
        return null;
    }

    @Override
    synchronized void method12243(int i_1) {
        if (!aBool9574) {
            while (true) {
                Node_Sub39 class282_sub39_2 = method14812();
                if (class282_sub39_2 == null) {
                    if (aBool9571) {
                        unlink();
                        aClass321_9573.method5744();
                    }
                    break;
                }
                if (class282_sub39_2.aShortArrayArray8003[0].length - anInt9570 * -235363691 * -1326835523 > i_1) {
                    anInt9570 = (anInt9570 * -235363691 + i_1 * -235363691) * -1326835523;
                    break;
                }
                i_1 -= class282_sub39_2.aShortArrayArray8003[0].length - anInt9570 * -235363691 * -1326835523;
                method14813();
            }
        }
    }

    @Override
	AbstractSoundNode_0 method12226() {
        return null;
    }
}
