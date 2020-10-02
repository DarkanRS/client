package com.jagex;

public class AnimationDefinitions {

    public static int anInt5930;
    public static boolean aBool5925;
    public int anInt5909;
    public int[] frameDurations;
    public int loopDelay = -1;
    public boolean[] aBoolArray5915;
    public int[] frames;
    public int priority = 5;
    public int leftHandItem = -1;
    public int rightHandItem = -1;
    public int maxLoops = 99;
    public int animatingPrecedence = -1;
    public int walkingPrecedence = -1;
    public int replayMode = 2;
    public int[] anIntArray5911;
    public int[][] anIntArrayArray5913;
    public boolean aBool5923;
    public boolean tweened;
    public boolean aBool5928;
    public int[] anIntArray5926;
    public int[] anIntArray5927;
    public int[] anIntArray5919;
    AnimationIndexLoader animationIndexLoader;
    IterableNodeMap aClass465_5910;

    public static void method11148(GraphNode_Sub1 class521_sub1_0, int i_1) {
        FontRenderer_Sub3.method14336(class521_sub1_0, i_1, true);
    }

    public String method11129(int i_1, String string_2) {
        if (aClass465_5910 == null) {
            return string_2;
        } else {
            ObjectNode class282_sub47_4 = (ObjectNode) aClass465_5910.get(i_1);
            return class282_sub47_4 == null ? string_2 : (String) class282_sub47_4.anObject8068;
        }
    }

    void method11130(ByteBuf rsbytebuffer_1) {
        while (true) {
            int i_3 = rsbytebuffer_1.readUnsignedByte();
            if (i_3 == 0) {
                return;
            }
            method11131(rsbytebuffer_1, i_3);
        }
    }

    void method11131(ByteBuf rsbytebuffer_1, int i_2) {
        int i_4;
        int i_5;
        if (i_2 == 1) {
            i_4 = rsbytebuffer_1.readUnsignedShort();
            frameDurations = new int[i_4];
            for (i_5 = 0; i_5 < i_4; i_5++) {
                frameDurations[i_5] = rsbytebuffer_1.readUnsignedShort();
            }
            frames = new int[i_4];
            for (i_5 = 0; i_5 < i_4; i_5++) {
                frames[i_5] = rsbytebuffer_1.readUnsignedShort();
            }
            for (i_5 = 0; i_5 < i_4; i_5++) {
                frames[i_5] += rsbytebuffer_1.readUnsignedShort() << 16;
            }
        } else if (i_2 == 2) {
            loopDelay = rsbytebuffer_1.readUnsignedShort();
        } else if (i_2 == 3) {
            aBoolArray5915 = new boolean[256];
            i_4 = rsbytebuffer_1.readUnsignedByte();
            for (i_5 = 0; i_5 < i_4; i_5++) {
                aBoolArray5915[rsbytebuffer_1.readUnsignedByte()] = true;
            }
        } else if (i_2 == 5) {
            priority = rsbytebuffer_1.readUnsignedByte();
        } else if (i_2 == 6) {
            leftHandItem = rsbytebuffer_1.readUnsignedShort();
        } else if (i_2 == 7) {
            rightHandItem = rsbytebuffer_1.readUnsignedShort();
        } else if (i_2 == 8) {
            maxLoops = rsbytebuffer_1.readUnsignedByte();
        } else if (i_2 == 9) {
            animatingPrecedence = rsbytebuffer_1.readUnsignedByte();
        } else if (i_2 == 10) {
            walkingPrecedence = rsbytebuffer_1.readUnsignedByte();
        } else if (i_2 == 11) {
            replayMode = rsbytebuffer_1.readUnsignedByte();
        } else if (i_2 == 12) {
            i_4 = rsbytebuffer_1.readUnsignedByte();
            anIntArray5911 = new int[i_4];
            for (i_5 = 0; i_5 < i_4; i_5++) {
                anIntArray5911[i_5] = rsbytebuffer_1.readUnsignedShort();
            }
            for (i_5 = 0; i_5 < i_4; i_5++) {
                anIntArray5911[i_5] += rsbytebuffer_1.readUnsignedShort() << 16;
            }
        } else {
            int i_7;
            if (i_2 == 13) {
                i_4 = rsbytebuffer_1.readUnsignedShort();
                anIntArrayArray5913 = new int[i_4][];
                for (i_5 = 0; i_5 < i_4; i_5++) {
                    int children = rsbytebuffer_1.readUnsignedByte();
                    if (children > 0) {
                        anIntArrayArray5913[i_5] = new int[children];
                        anIntArrayArray5913[i_5][0] = rsbytebuffer_1.read24BitUnsignedInteger();
                        for (i_7 = 1; i_7 < children; i_7++) {
                            anIntArrayArray5913[i_5][i_7] = rsbytebuffer_1.readUnsignedShort();
                        }
                    }
                }
            } else if (i_2 == 14) {
                aBool5923 = true;
            } else if (i_2 == 15) {
                tweened = true;
            } else if (i_2 != 16) {
                if (i_2 == 18) {
                    aBool5928 = true;
                } else if (i_2 == 19) {
                    if (anIntArray5926 == null) {
                        anIntArray5926 = new int[anIntArrayArray5913.length];
                        for (i_4 = 0; i_4 < anIntArrayArray5913.length; i_4++) {
                            anIntArray5926[i_4] = 255;
                        }
                    }
                    anIntArray5926[rsbytebuffer_1.readUnsignedByte()] = rsbytebuffer_1.readUnsignedByte();
                } else if (i_2 == 20) {
                    if (anIntArray5927 == null || anIntArray5919 == null) {
                        anIntArray5927 = new int[anIntArrayArray5913.length];
                        anIntArray5919 = new int[anIntArrayArray5913.length];
                        for (i_4 = 0; i_4 < anIntArrayArray5913.length; i_4++) {
                            anIntArray5927[i_4] = 256;
                            anIntArray5919[i_4] = 256;
                        }
                    }
                    i_4 = rsbytebuffer_1.readUnsignedByte();
                    anIntArray5927[i_4] = rsbytebuffer_1.readUnsignedShort();
                    anIntArray5919[i_4] = rsbytebuffer_1.readUnsignedShort();
                } else if (i_2 == 249) {
                    i_4 = rsbytebuffer_1.readUnsignedByte();
                    if (aClass465_5910 == null) {
                        i_5 = Utils.nextPowerOfTwo(i_4);
                        aClass465_5910 = new IterableNodeMap(i_5);
                    }
                    for (i_5 = 0; i_5 < i_4; i_5++) {
                        boolean bool_9 = rsbytebuffer_1.readUnsignedByte() == 1;
                        i_7 = rsbytebuffer_1.read24BitUnsignedInteger();
                        Object obj_8;
                        if (bool_9) {
                            obj_8 = new ObjectNode(rsbytebuffer_1.readString());
                        } else {
                            obj_8 = new IntNode(rsbytebuffer_1.readInt());
                        }
                        aClass465_5910.put((Node) obj_8, i_7);
                    }
                }
            }
        }
    }

    public boolean ready() {
        if (frames == null) {
            return true;
        } else {
            boolean bool_1 = true;
            int[] ints_2 = frames;
            for (int i_3 = 0; i_3 < ints_2.length; i_3++) {
                int i_4 = ints_2[i_3];
                if (animationIndexLoader.getAnimationFrame(i_4 >>> 16) == null) {
                    bool_1 = false;
                }
            }
            return bool_1;
        }
    }

    public int method11133(int i_1, int i_2) {
        if (aClass465_5910 == null) {
            return i_2;
        } else {
            IntNode class282_sub38_4 = (IntNode) aClass465_5910.get(i_1);
            return class282_sub38_4 == null ? i_2 : class282_sub38_4.value;
        }
    }

    void method11143() {
        if (animatingPrecedence == -1) {
            if (aBoolArray5915 != null) {
                animatingPrecedence = 2;
            } else {
                animatingPrecedence = 0;
            }
        }
        if (walkingPrecedence == -1) {
            if (aBoolArray5915 != null) {
                walkingPrecedence = 2;
            } else {
                walkingPrecedence = 0;
            }
        }
    }
}
