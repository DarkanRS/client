package com.jagex;

public class Class302 {

    static LoadingStage[] aClass387Array3557;
    static Interface27[] anInterface27Array3559;
    static int anInt3561;
    static long aLong3562;
    static int anInt3563;
    static int[] anIntArray3558 = new int[]{4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1};
    static int anInt3560 = -1;
    static int anInt3564 = -1;

    Class302() throws Throwable {
        throw new Error();
    }

    static int method5360(int i_0, int i_1) {
        int i_3 = i_0 >> 31 & i_1 - 1;
        return (i_0 + (i_0 >>> 31)) % i_1 + i_3;
    }

    static void handleMovementAnimations(Entity animable, int moveType, int i_2, int i_3, int i_4) {
        BASDefinitions renderAnim = animable.getRenderAnimDefs();
        MovingAnimation animation = animable.aAnimation_Sub3_10337;
        int turnDirection = animable.turnDirection - animable.aClass19_10359.turnDirection & 0x3fff;
        if (moveType == MovementType.STATIONARY.id) {
            if (turnDirection == 0 && animable.turningTicks <= 25) {
                if (!animation.aBool7891 || !renderAnim.method3810(animation.method7597())) {
                    animation.animate(renderAnim.getStandAnimation());
                    animation.aBool7891 = animation.hasDefs();
                }
            } else if (i_3 < 0 && renderAnim.standTurn1 != -1) {
                animation.animate(renderAnim.standTurn1);
                animation.aBool7891 = false;
            } else if (i_3 > 0 && renderAnim.standTurn2 != -1) {
                animation.animate(renderAnim.standTurn2);
                animation.aBool7891 = false;
            } else if (!animation.aBool7891 || !renderAnim.method3810(animation.method7597())) {
                animation.animate(renderAnim.getStandAnimation());
                animation.aBool7891 = animable.aAnimation_Sub3_10337.hasDefs();
            }
        } else if (animable.faceEntity == -1 || turnDirection < 10240 && turnDirection > 2048) {
            if (turnDirection == 0 && animable.turningTicks <= 25) {
                if (moveType == MovementType.RUNNING.id && renderAnim.runningAnimation != -1) {
                    animation.animate(renderAnim.runningAnimation);
                } else if (moveType == MovementType.HALF_WALK.id && renderAnim.teleportingAnimation != -1) {
                    animation.animate(renderAnim.teleportingAnimation);
                } else {
                    animation.animate(renderAnim.walkAnimation);
                }
                animation.aBool7891 = false;
            } else {
                if (moveType == MovementType.RUNNING.id && renderAnim.runningAnimation != -1) {
                    if (i_3 < 0 && renderAnim.runTurn1 != -1) {
                        animation.animate(renderAnim.runTurn1);
                    } else if (i_3 > 0 && renderAnim.runTurn2 != -1) {
                        animation.animate(renderAnim.runTurn2);
                    } else {
                        animation.animate(renderAnim.runningAnimation);
                    }
                } else if (moveType == MovementType.HALF_WALK.id && renderAnim.teleportingAnimation != -1) {
                    if (i_3 < 0 && renderAnim.teleTurn1 != -1) {
                        animation.animate(renderAnim.teleTurn1);
                    } else if (i_3 > 0 && renderAnim.teleTurn2 != -1) {
                        animation.animate(renderAnim.teleTurn2);
                    } else {
                        animation.animate(renderAnim.teleportingAnimation);
                    }
                } else if (i_3 < 0 && renderAnim.walkTurn1 != -1) {
                    animation.animate(renderAnim.walkTurn1);
                } else if (i_3 > 0 && renderAnim.walkTurn2 != -1) {
                    animation.animate(renderAnim.walkTurn2);
                } else {
                    animation.animate(renderAnim.walkAnimation);
                }
                animation.aBool7891 = false;
            }
        } else {
            int walkDirection = client.NPC_TURN_DIRECTIONS[i_2] - animable.aClass19_10359.turnDirection & 0x3fff;
            if (moveType == MovementType.RUNNING.id && renderAnim.runningAnimation != -1) {
                if (walkDirection > 2048 && walkDirection <= 6144 && renderAnim.runDir1 != -1) {
                    animation.animate(renderAnim.runDir1);
                } else if (walkDirection >= 10240 && walkDirection < 14336 && renderAnim.runDir2 != -1) {
                    animation.animate(renderAnim.runDir2);
                } else if (walkDirection > 6144 && walkDirection < 10240 && renderAnim.runDir3 != -1) {
                    animation.animate(renderAnim.runDir3);
                } else {
                    animation.animate(renderAnim.runningAnimation);
                }
            } else if (moveType == MovementType.HALF_WALK.id && renderAnim.teleportingAnimation != -1) {
                if (walkDirection > 2048 && walkDirection <= 6144 && renderAnim.teleDir1 != -1) {
                    animation.animate(renderAnim.teleDir1);
                } else if (walkDirection >= 10240 && walkDirection < 14336 && renderAnim.teleDir2 != -1) {
                    animation.animate(renderAnim.teleDir2);
                } else if (walkDirection > 6144 && walkDirection < 10240 && renderAnim.teleDir3 != -1) {
                    animation.animate(renderAnim.teleDir3);
                } else {
                    animation.animate(renderAnim.teleportingAnimation);
                }
            } else if (walkDirection > 2048 && walkDirection <= 6144 && renderAnim.walkDir1 != -1) {
                animation.animate(renderAnim.walkDir1);
            } else if (walkDirection >= 10240 && walkDirection < 14336 && renderAnim.walkDir2 != -1) {
                animation.animate(renderAnim.walkDir2);
            } else if (walkDirection > 6144 && walkDirection < 10240 && renderAnim.walkDir3 != -1) {
                animation.animate(renderAnim.walkDir3);
            } else {
                animation.animate(renderAnim.walkAnimation);
            }
            animation.aBool7891 = false;
        }
    }

    public static long method5363(int i_0, int i_1) {
        return (long) (i_0 + 11745) * 86400000L;
    }

    public static int method5364(int i_0, int i_1, float f_2) {
        return FontRenderer_Sub3.method14337(i_0, i_1, (int) f_2);
    }
}
