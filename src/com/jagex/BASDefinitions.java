package com.jagex;

import java.util.Iterator;

public class BASDefinitions {

    static int anInt2831;
    public int renderAnimId;
    public int standAnimation = -1;
    public int walkAnimation = -1;
    public int teleportingAnimation = -1;
    public int teleDir3 = -1;
    public int teleDir2 = -1;
    public int teleDir1 = -1;
    public int runningAnimation = -1;
    public int runDir3 = -1;
    public int runDir2 = -1;
    public int runDir1 = -1;
    public int anInt2786;
    public int anInt2829;
    public int[] anIntArray2811;
    public int[][] anIntArrayArray2802;
    public int anInt2820;
    public int anInt2804;
    public int anInt2825;
    public int anInt2823;
    public int anInt2824;
    public int anInt2816;
    public int anInt2815;
    public int anInt2827;
    public int anInt2826 = -1;
    public int standTurn1 = -1;
    public int standTurn2 = -1;
    public int walkDir3 = -1;
    public int walkDir2 = -1;
    public int walkDir1 = -1;
    public int anInt2798 = -1;
    public int teleTurn1 = -1;
    public int teleTurn2 = -1;
    public int runTurn1 = -1;
    public int runTurn2 = -1;
    public int walkTurn1 = -1;
    public int walkTurn2 = -1;
    public int[] randomStandAnimations;
    public int[] randomStandAnimationChances;
    public boolean aBool2787 = true;
    public int anInt2813;
    public int anInt2790;
    public int[] anIntArray2818;
    public int[][] anIntArrayArray2791;
    RenderAnimIndexLoader aClass211_2788;
    int totalChance;
    Matrix44Var[] matrices;

    void method3808(Packet rsbytebuffer_1, int i_2) {
        if (i_2 == 1) {
            standAnimation = rsbytebuffer_1.readBigSmart();
            walkAnimation = rsbytebuffer_1.readBigSmart();
        } else if (i_2 == 2) {
            teleportingAnimation = rsbytebuffer_1.readBigSmart();
        } else if (i_2 == 3) {
            teleDir3 = rsbytebuffer_1.readBigSmart();
        } else if (i_2 == 4) {
            teleDir2 = rsbytebuffer_1.readBigSmart();
        } else if (i_2 == 5) {
            teleDir1 = rsbytebuffer_1.readBigSmart();
        } else if (i_2 == 6) {
            runningAnimation = rsbytebuffer_1.readBigSmart();
        } else if (i_2 == 7) {
            runDir3 = rsbytebuffer_1.readBigSmart();
        } else if (i_2 == 8) {
            runDir2 = rsbytebuffer_1.readBigSmart();
        } else if (i_2 == 9) {
            runDir1 = rsbytebuffer_1.readBigSmart();
        } else if (i_2 == 26) {
            anInt2786 = (short) (rsbytebuffer_1.readUnsignedByte() * 4);
            anInt2829 = (short) (rsbytebuffer_1.readUnsignedByte() * 4);
        } else {
            int i_4;
            int i_5;
            if (i_2 == 27) {
                if (anIntArrayArray2802 == null) {
                    anIntArrayArray2802 = new int[aClass211_2788.aClass526_2672.hidden.length][];
                }
                i_4 = rsbytebuffer_1.readUnsignedByte();
                anIntArrayArray2802[i_4] = new int[6];
                for (i_5 = 0; i_5 < 6; i_5++) {
                    anIntArrayArray2802[i_4][i_5] = rsbytebuffer_1.readShort();
                }
            } else if (i_2 == 28) {
                i_4 = rsbytebuffer_1.readUnsignedByte();
                anIntArray2811 = new int[i_4];
                for (i_5 = 0; i_5 < i_4; i_5++) {
                    anIntArray2811[i_5] = rsbytebuffer_1.readUnsignedByte();
                    if (anIntArray2811[i_5] == 255) {
                        anIntArray2811[i_5] = -1;
                    }
                }
            } else if (i_2 == 29) {
                anInt2820 = rsbytebuffer_1.readUnsignedByte();
            } else if (i_2 == 30) {
                anInt2804 = rsbytebuffer_1.readUnsignedShort();
            } else if (i_2 == 31) {
                anInt2825 = rsbytebuffer_1.readUnsignedByte();
            } else if (i_2 == 32) {
                anInt2823 = rsbytebuffer_1.readUnsignedShort();
            } else if (i_2 == 33) {
                anInt2824 = rsbytebuffer_1.readShort();
            } else if (i_2 == 34) {
                anInt2816 = rsbytebuffer_1.readUnsignedByte();
            } else if (i_2 == 35) {
                anInt2815 = rsbytebuffer_1.readUnsignedShort();
            } else if (i_2 == 36) {
                anInt2827 = rsbytebuffer_1.readShort();
            } else if (i_2 == 37) {
                anInt2826 = rsbytebuffer_1.readUnsignedByte();
            } else if (i_2 == 38) {
                standTurn1 = rsbytebuffer_1.readBigSmart();
            } else if (i_2 == 39) {
                standTurn2 = rsbytebuffer_1.readBigSmart();
            } else if (i_2 == 40) {
                walkDir3 = rsbytebuffer_1.readBigSmart();
            } else if (i_2 == 41) {
                walkDir2 = rsbytebuffer_1.readBigSmart();
            } else if (i_2 == 42) {
                walkDir1 = rsbytebuffer_1.readBigSmart();
            } else if (i_2 == 43) {
                rsbytebuffer_1.readUnsignedShort();
            } else if (i_2 == 44) {
                rsbytebuffer_1.readUnsignedShort();
            } else if (i_2 == 45) {
                anInt2798 = rsbytebuffer_1.readUnsignedShort();
            } else if (i_2 == 46) {
                teleTurn1 = rsbytebuffer_1.readBigSmart();
            } else if (i_2 == 47) {
                teleTurn2 = rsbytebuffer_1.readBigSmart();
            } else if (i_2 == 48) {
                runTurn1 = rsbytebuffer_1.readBigSmart();
            } else if (i_2 == 49) {
                runTurn2 = rsbytebuffer_1.readBigSmart();
            } else if (i_2 == 50) {
                walkTurn1 = rsbytebuffer_1.readBigSmart();
            } else if (i_2 == 51) {
                walkTurn2 = rsbytebuffer_1.readBigSmart();
            } else if (i_2 == 52) {
                i_4 = rsbytebuffer_1.readUnsignedByte();
                randomStandAnimations = new int[i_4];
                randomStandAnimationChances = new int[i_4];
                for (i_5 = 0; i_5 < i_4; i_5++) {
                    randomStandAnimations[i_5] = rsbytebuffer_1.readBigSmart();
                    int i_6 = rsbytebuffer_1.readUnsignedByte();
                    randomStandAnimationChances[i_5] = i_6;
                    totalChance += i_6;
                }
            } else if (i_2 == 53) {
                aBool2787 = false;
            } else if (i_2 == 54) {
                anInt2813 = rsbytebuffer_1.readUnsignedByte() << 6;
                anInt2790 = rsbytebuffer_1.readUnsignedByte() << 6;
            } else if (i_2 == 55) {
                if (anIntArray2818 == null) {
                    anIntArray2818 = new int[aClass211_2788.aClass526_2672.hidden.length];
                }
                i_4 = rsbytebuffer_1.readUnsignedByte();
                anIntArray2818[i_4] = rsbytebuffer_1.readUnsignedShort();
            } else if (i_2 == 56) {
                if (anIntArrayArray2791 == null) {
                    anIntArrayArray2791 = new int[aClass211_2788.aClass526_2672.hidden.length][];
                }
                i_4 = rsbytebuffer_1.readUnsignedByte();
                anIntArrayArray2791[i_4] = new int[3];
                for (i_5 = 0; i_5 < 3; i_5++) {
                    anIntArrayArray2791[i_4][i_5] = rsbytebuffer_1.readShort();
                }
            }
        }
    }

    public int getStandAnimation() {
        if (standAnimation != -1) {
            return standAnimation;
        } else if (randomStandAnimations == null) {
            return -1;
        } else {
            int i_2 = (int) (Math.random() * totalChance);
            int i_3;
            for (i_3 = 0; i_2 >= randomStandAnimationChances[i_3]; i_3++) {
                i_2 -= randomStandAnimationChances[i_3];
            }
            return randomStandAnimations[i_3];
        }
    }

    public boolean method3810(int i_1) {
        if (i_1 == -1) {
            return false;
        } else if (standAnimation == i_1) {
            return true;
        } else {
            if (randomStandAnimations != null) {
                for (int i_3 = 0; i_3 < randomStandAnimations.length; i_3++) {
                    if (randomStandAnimations[i_3] == i_1) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public Matrix44Var[] method3811() {
        if (matrices != null) {
            return matrices;
        } else if (anIntArrayArray2802 == null) {
            return null;
        } else {
            matrices = new Matrix44Var[anIntArrayArray2802.length];
            for (int i = 0; i < anIntArrayArray2802.length; i++) {
                int i_3 = 0;
                int i_4 = 0;
                int i_5 = 0;
                int xRot = 0;
                int yRot = 0;
                int zRot = 0;
                if (anIntArrayArray2802[i] != null) {
                    i_3 = anIntArrayArray2802[i][0];
                    i_4 = anIntArrayArray2802[i][1];
                    i_5 = anIntArrayArray2802[i][2];
                    xRot = anIntArrayArray2802[i][3] << 3;
                    yRot = anIntArrayArray2802[i][4] << 3;
                    zRot = anIntArrayArray2802[i][5] << 3;
                }
                if (i_3 != 0 || i_4 != 0 || i_5 != 0 || xRot != 0 || yRot != 0 || zRot != 0) {
                    Matrix44Var matrix = matrices[i] = new Matrix44Var();
                    if (zRot != 0) {
                        matrix.rotation(0.0F, 0.0F, 1.0F, Class382.method6508(zRot));
                    }
                    if (xRot != 0) {
                        matrix.rotation(1.0F, 0.0F, 0.0F, Class382.method6508(xRot));
                    }
                    if (yRot != 0) {
                        matrix.rotation(0.0F, 1.0F, 0.0F, Class382.method6508(yRot));
                    }
                    matrix.method5219(i_3, i_4, i_5);
                }
            }
            return matrices;
        }
    }

    void method3821(Packet rsbytebuffer_1) {
        while (true) {
            int i_3 = rsbytebuffer_1.readUnsignedByte();
            if (i_3 == 0) {
                return;
            }
            method3808(rsbytebuffer_1, i_3);
        }
    }

    public int[] method3828() {
        IterableNodeMap<Node> iterablenodemap_2 = new IterableNodeMap<>(16);
        AccountCreationStage.method253(standAnimation, iterablenodemap_2);
        int[] ints_3;
        int i_4;
        if (randomStandAnimations != null) {
            ints_3 = randomStandAnimations;
            for (i_4 = 0; i_4 < ints_3.length; i_4++) {
                int i_7 = ints_3[i_4];
                AccountCreationStage.method253(i_7, iterablenodemap_2);
            }
        }
        AccountCreationStage.method253(standTurn1, iterablenodemap_2);
        AccountCreationStage.method253(standTurn2, iterablenodemap_2);
        AccountCreationStage.method253(walkAnimation, iterablenodemap_2);
        AccountCreationStage.method253(walkDir3, iterablenodemap_2);
        AccountCreationStage.method253(walkDir2, iterablenodemap_2);
        AccountCreationStage.method253(walkDir1, iterablenodemap_2);
        AccountCreationStage.method253(runningAnimation, iterablenodemap_2);
        AccountCreationStage.method253(runDir3, iterablenodemap_2);
        AccountCreationStage.method253(runDir2, iterablenodemap_2);
        AccountCreationStage.method253(runDir1, iterablenodemap_2);
        AccountCreationStage.method253(teleportingAnimation, iterablenodemap_2);
        AccountCreationStage.method253(teleDir3, iterablenodemap_2);
        AccountCreationStage.method253(teleDir2, iterablenodemap_2);
        AccountCreationStage.method253(teleDir1, iterablenodemap_2);
        AccountCreationStage.method253(teleTurn1, iterablenodemap_2);
        AccountCreationStage.method253(teleTurn2, iterablenodemap_2);
        AccountCreationStage.method253(runTurn1, iterablenodemap_2);
        AccountCreationStage.method253(runTurn2, iterablenodemap_2);
        AccountCreationStage.method253(walkTurn1, iterablenodemap_2);
        AccountCreationStage.method253(walkTurn2, iterablenodemap_2);
        ints_3 = new int[iterablenodemap_2.size()];
        i_4 = 0;
        Node node_6;
        for (Iterator<Node> iterator_5 = iterablenodemap_2.iterator(); iterator_5.hasNext(); ints_3[i_4++] = (int) node_6.pointer) {
            node_6 = (Node) iterator_5.next();
        }
        return ints_3;
    }
}
