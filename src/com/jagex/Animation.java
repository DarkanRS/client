package com.jagex;

public class Animation {

    AnimationDefinitions defs;
    boolean aBool5462;
    boolean aBool5463;
    int speed;
    int anInt5459;
    int anInt5460;
    int anInt5466;
    int anInt5457;
    int anInt5461;
    boolean aBool5456;
    Class462 aClass462_5464;
    Class462 aClass462_5467;

    Animation(boolean bool_1) {
        aBool5463 = bool_1;
        aClass462_5464 = new Class462();
        if (aBool5463) {
            aClass462_5467 = new Class462();
        } else {
            aClass462_5467 = null;
        }
    }

    static Class149_Sub1 method7644(Packet rsbytebuffer_0) {
        return new Class149_Sub1(rsbytebuffer_0.readShort(), rsbytebuffer_0.readShort(), rsbytebuffer_0.readShort(), rsbytebuffer_0.readShort(), rsbytebuffer_0.read24BitUnsignedInteger(), rsbytebuffer_0.read24BitUnsignedInteger(), rsbytebuffer_0.readUnsignedByte());
    }

    boolean method7562() {
        if (defs != null) {
            boolean bool_2 = aClass462_5464.method7707(NamedFileReference.ANIMATION_INDEX_LOADER, defs, anInt5460, anInt5466, defs.frames);
            if (bool_2 && aBool5463 && defs.anIntArray5911 != null) {
                aClass462_5467.method7707(NamedFileReference.ANIMATION_INDEX_LOADER, defs, anInt5460, anInt5466, defs.anIntArray5911);
            }
            return bool_2;
        } else {
            return false;
        }
    }

    public void method7563(Animation animation_1) {
        defs = animation_1.defs;
        aBool5462 = animation_1.aBool5462;
        aBool5463 = animation_1.aBool5463;
        speed = animation_1.speed;
        anInt5459 = animation_1.anInt5459;
        anInt5460 = animation_1.anInt5460;
        anInt5466 = animation_1.anInt5466;
        anInt5457 = animation_1.anInt5457;
        method7588();
    }

    public boolean hasDefs() {
        return defs != null;
    }

    public AnimationDefinitions getDefs() {
        return defs;
    }

    public void update(int i_1) {
        animateFull(i_1, 0, 0, false);
    }

    public void method7569() {
        animateFull(-1, 0, 0, false);
    }

    public void animate(int animationId) {
        animate(animationId, 0, 0, false, true);
    }

    public void animateFull(int animationId, int speed, int i_3, boolean bool_4) {
        animate(animationId, speed, i_3, bool_4, false);
    }

    void animate(int animationId, int speed, int i_3, boolean bool_4, boolean bool_5) {
        if (animationId != method7597()) {
            if (animationId == -1) {
                defs = null;
            } else {
                if (defs != null && defs.anInt5909 == animationId) {
                    if (defs.replayMode == 0) {
                        return;
                    }
                } else {
                    defs = NamedFileReference.ANIMATION_INDEX_LOADER.getAnimDefs(animationId);
                }
                anInt5459 = 0;
                this.speed = speed;
                anInt5461 = i_3;
                aBool5456 = bool_5;
                if (bool_4) {
                    anInt5460 = (int) (Math.random() * defs.frames.length);
                    anInt5457 = (int) (Math.random() * defs.frameDurations[anInt5460]);
                } else {
                    anInt5460 = 0;
                    anInt5457 = 0;
                }
                anInt5466 = anInt5460 + 1;
                if (anInt5466 < 0 || anInt5466 >= defs.frames.length) {
                    anInt5466 = -1;
                }
                if (this.speed == 0) {
                    method7586(defs, anInt5460);
                }
                aBool5462 = false;
            }
            method7588();
        }
    }

    public boolean hasSpeed() {
        return speed != 0;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int i_1) {
        speed = i_1;
    }

    public void rasterize(MeshRasterizer meshrasterizer_1, int i_2) {
        if (defs != null && defs.frames != null && method7562()) {
            meshrasterizer_1.method11262(aClass462_5464.aCacheableNode_Sub13_5545, aClass462_5464.anInt5542, aClass462_5464.animationFrameSet, aClass462_5464.anInt5547, anInt5457, defs.frameDurations[anInt5460], i_2, defs.aBool5923);
            if (aBool5463 && defs.anIntArray5911 != null && aClass462_5467.aBool5544) {
                meshrasterizer_1.method11262(aClass462_5467.aCacheableNode_Sub13_5545, aClass462_5467.anInt5542, aClass462_5467.animationFrameSet, aClass462_5467.anInt5547, anInt5457, defs.frameDurations[anInt5460], i_2, defs.aBool5923);
            }
        }
    }

    public void method7578(MeshRasterizer meshrasterizer_1, int i_3) {
        if (defs.frames != null && method7562()) {
            meshrasterizer_1.method11258(aClass462_5464.aCacheableNode_Sub13_5545, aClass462_5464.anInt5542, aClass462_5464.animationFrameSet, aClass462_5464.anInt5547, anInt5457, defs.frameDurations[anInt5460], i_3, defs.aBool5923, null);
            if (aBool5463 && defs.anIntArray5911 != null && aClass462_5467.aBool5544) {
                meshrasterizer_1.method11258(aClass462_5467.aCacheableNode_Sub13_5545, aClass462_5467.anInt5542, aClass462_5467.animationFrameSet, aClass462_5467.anInt5547, anInt5457, defs.frameDurations[anInt5460], i_3, defs.aBool5923, null);
            }
        }
    }

    public void method7579(MeshRasterizer meshrasterizer_1) {
        if (defs.frames != null && method7562()) {
            meshrasterizer_1.method11284(aClass462_5464.aCacheableNode_Sub13_5545, aClass462_5464.anInt5542);
            if (aBool5463 && defs.anIntArray5911 != null && aClass462_5467.aBool5544) {
                meshrasterizer_1.method11284(aClass462_5467.aCacheableNode_Sub13_5545, aClass462_5467.anInt5542);
            }
        }
    }

    public boolean method7580() {
        return aBool5462;
    }

    public void method7582() {
        method7583(0);
    }

    public void method7583(int i_1) {
        anInt5460 = 0;
        anInt5466 = defs.frames.length > 1 ? 1 : -1;
        anInt5457 = 0;
        aBool5462 = false;
        speed = i_1;
        anInt5459 = 0;
        if (defs != null & defs.frames != null) {
            method7586(defs, anInt5460);
            method7588();
        }
    }

    public void method7584() {
        anInt5459 = 0;
    }

    public boolean method7585(int i_1) {
        return !(defs == null | (i_1 -= speed) <= 0) && defs.tweened | anInt5457 + i_1 > defs.frameDurations[anInt5460];
    }

    void method7586(AnimationDefinitions animationdefinitions_1, int i_2) {
    }

    void method7588() {
        aClass462_5464.method7708();
        if (aBool5463) {
            aClass462_5467.method7708();
        }
    }

    public int method7597() {
        return defs != null ? defs.anInt5909 : -1;
    }

    public void method7615(int i_1, int i_2) {
        animateFull(i_1, i_2, 0, false);
    }

    public boolean method7627(int i_1) {
        if (defs != null && i_1 != 0) {
            if (speed > 0) {
                if (speed >= i_1) {
                    speed -= i_1;
                    return false;
                }
                i_1 -= speed;
                speed = 0;
                method7586(defs, anInt5460);
            }
            i_1 += anInt5457;
            boolean bool_3 = defs.tweened | AnimationDefinitions.aBool5925;
            if (i_1 > 100 && defs.loopDelay > 0) {
                int i_4;
                for (i_4 = defs.frames.length - defs.loopDelay; anInt5460 < i_4 && i_1 > defs.frameDurations[anInt5460]; anInt5460++) {
                    i_1 -= defs.frameDurations[anInt5460];
                }
                if (anInt5460 >= i_4) {
                    int i_5 = 0;
                    for (int i_6 = i_4; i_6 < defs.frames.length; i_6++) {
                        i_5 += defs.frameDurations[i_6];
                    }
                    if (anInt5461 == 0) {
                        anInt5459 += i_1 / i_5;
                    }
                    i_1 %= i_5;
                }
                anInt5466 = anInt5460 + 1;
                if (anInt5466 >= defs.frames.length) {
                    if (defs.loopDelay == -1 && aBool5456) {
                        anInt5466 = 0;
                    } else {
                        anInt5466 -= defs.loopDelay;
                    }
                    if (anInt5466 < 0 || anInt5466 >= defs.frames.length) {
                        anInt5466 = -1;
                    }
                }
                bool_3 = true;
            }
            while (i_1 > defs.frameDurations[anInt5460]) {
                bool_3 = true;
                i_1 -= defs.frameDurations[++anInt5460 - 1];
                if (anInt5460 >= defs.frames.length) {
                    if (defs.loopDelay != -1 && anInt5461 != 2) {
                        anInt5460 -= defs.loopDelay;
                        if (anInt5461 == 0) {
                            ++anInt5459;
                        }
                    }
                    if (anInt5459 >= defs.maxLoops || anInt5460 < 0 || anInt5460 >= defs.frames.length) {
                        aBool5462 = true;
                        break;
                    }
                }
                method7586(defs, anInt5460);
                anInt5466 = anInt5460 + 1;
                if (anInt5466 >= defs.frames.length) {
                    if (defs.loopDelay == -1 && aBool5456) {
                        anInt5466 = 0;
                    } else {
                        anInt5466 -= defs.loopDelay;
                    }
                    if (anInt5466 < 0 || anInt5466 >= defs.frames.length) {
                        anInt5466 = -1;
                    }
                }
            }
            anInt5457 = i_1;
            if (bool_3) {
                method7588();
            }
            return bool_3;
        } else {
            return false;
        }
    }

    public int method7640() {
        if (method7562()) {
            int i_2 = 0;
            if (method7562()) {
                i_2 |= aClass462_5464.anInt5543;
                if (aBool5463 && defs.anIntArray5911 != null) {
                    i_2 |= aClass462_5467.anInt5543;
                }
            }
            return i_2;
        } else {
            return 0;
        }
    }
}
