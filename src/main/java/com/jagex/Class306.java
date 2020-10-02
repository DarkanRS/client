package com.jagex;

public class Class306 implements Runnable {

    boolean aBool3597;
    long aLong3602;
    String aString3603;
    int anInt3596;
    LoadingStage aClass387_3605;
    int anInt3600;
    Interface27 anInterface27_3604;
    Interface27 anInterface27_3598 = new Class304();
    volatile boolean aBool3599;
    long aLong3601;

    static void method5458(int i_0, int i_1, int i_2, int i_3) {
        float f_5 = (float) Class291_Sub1.yLength / Class291_Sub1.xLength;
        int i_6 = i_2;
        int i_7 = i_3;
        if (f_5 < 1.0F) {
            i_7 = (int) (i_2 * f_5);
        } else {
            i_6 = (int) (i_3 / f_5);
        }
        i_0 -= (i_2 - i_6) / 2;
        i_1 -= (i_3 - i_7) / 2;
        MapSpriteIndexLoader.anInt5123 = i_0 * Class291_Sub1.xLength / i_6;
        Class475.anInt5624 = Class291_Sub1.yLength - Class291_Sub1.yLength * i_1 / i_7;
        Class291_Sub1.anInt8014 = -1;
        Class291_Sub1.anInt8016 = -1;
        Class89.method1502();
    }

    int method5418() {
        return anInt3600;
    }

    synchronized void method5419() {
        aBool3597 = true;
    }

    synchronized void method5422(long long_1, String string_3, int i_4, LoadingStage xloadingstage_5) {
        aLong3602 = long_1;
        aString3603 = string_3;
        anInt3596 = i_4;
        aClass387_3605 = xloadingstage_5;
    }

    public int method5423() {
        if (aClass387_3605 == null) {
            return 0;
        } else {
            int i_2 = aClass387_3605.anInt4712;
            return aClass387_3605.aBool4718 && anInt3596 < aClass387_3605.anInt4703 ? anInt3596 + 1 : (i_2 >= 0 && i_2 < Class302.aClass387Array3557.length - 1 ? (aClass387_3605.anInt4715 == anInt3596 ? aClass387_3605.anInt4703 : aClass387_3605.anInt4715) : 100);
        }
    }

    public int method5424() {
        return anInt3596;
    }

    public String method5425() {
        return aString3603;
    }

    public LoadingStage method5427() {
        return aClass387_3605;
    }

    @Override
    public void run() {
        while (!aBool3599) {
            long long_1 = Utils.time();
            synchronized (this) {
                try {
                    ++anInt3600;
                    if (anInterface27_3598 instanceof Class304) {
                        anInterface27_3598.method187();
                    } else {
                        long long_4 = Utils.time();
                        if (Renderers.CURRENT_RENDERER != null && anInterface27_3604 != null && anInterface27_3604.method190() != 0 && aLong3601 >= long_4 - anInterface27_3604.method190()) {
                            int i_6 = (int) (255L * (long_4 - aLong3601) / anInterface27_3604.method190());
                            int i_7 = 255 - i_6;
                            i_6 = i_6 << 24 | 0xffffff;
                            i_7 = i_7 << 24 | 0xffffff;
                            EntityNode.method4891();
                            Renderers.CURRENT_RENDERER.ba(1, 0);
                            NativeSprite nativesprite_8 = Renderers.CURRENT_RENDERER.method8440(Class349.BASE_WINDOW_WIDTH, Engine.BASE_WINDOW_HEIGHT * -969250379);
                            Class158_Sub1 class158_sub1_9 = Renderers.CURRENT_RENDERER.method8418();
                            class158_sub1_9.method13759(0, nativesprite_8.method2808());
                            Renderers.CURRENT_RENDERER.method8637(class158_sub1_9);
                            anInterface27_3604.method187();
                            Renderers.CURRENT_RENDERER.method8416(class158_sub1_9);
                            nativesprite_8.method2742(0, 0, 0, i_7, 1);
                            Renderers.CURRENT_RENDERER.method8637(class158_sub1_9);
                            Renderers.CURRENT_RENDERER.ba(1, 0);
                            anInterface27_3598.method187();
                            Renderers.CURRENT_RENDERER.method8416(class158_sub1_9);
                            nativesprite_8.method2742(0, 0, 0, i_6, 1);
                        } else {
                            if (anInterface27_3604 != null) {
                                aBool3597 = true;
                                anInterface27_3604.method188();
                                anInterface27_3604 = null;
                            }
                            if (aBool3597) {
                                EntityNode.method4891();
                                if (Renderers.CURRENT_RENDERER != null) {
                                    Renderers.CURRENT_RENDERER.ba(1, 0);
                                }
                            }
                            anInterface27_3598.method187();
                        }
                        try {
                            if (Renderers.CURRENT_RENDERER != null && !(anInterface27_3598 instanceof Class304)) {
                                Renderers.CURRENT_RENDERER.method8393();
                            }
                        } catch (Exception_Sub3 exception_sub3_14) {
                            Class151.method2594(exception_sub3_14.getMessage() + Class308.aclient3620.method4669(), exception_sub3_14);
                            ParticleProducer.method11500(0, true);
                        }
                    }
                    aBool3597 = false;
                    if (Renderers.CURRENT_RENDERER != null && !(anInterface27_3598 instanceof Class304) && aClass387_3605.anInt4712 < LoadingStage.aClass387_4698.anInt4712) {
                        Class532_Sub1.method12840();
                    }
                } catch (Exception exception_15) {
                    continue;
                }
            }
            long long_12 = Utils.time();
            int i_5 = (int) (20L - (long_12 - long_1));
            if (i_5 > 0) {
                Class89.sleep(i_5);
            }
        }
    }

    void method5437() {
        aBool3599 = true;
    }

    public long method5439() {
        return aLong3602;
    }

    synchronized void method5445(Interface27 interface27_1) {
        anInterface27_3604 = anInterface27_3598;
        anInterface27_3598 = interface27_1;
        aLong3601 = Utils.time();
    }

    synchronized boolean method5450() {
        return anInterface27_3598.method189(aLong3601);
    }
}
