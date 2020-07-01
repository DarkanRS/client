package com.jagex;

public class ParticleProducer {

    int particleCount;
    int anInt7108;
    int anInt7111;
    int anInt7112;
    ParticleTriangle aClass234_7109 = new ParticleTriangle();
    ParticleTriangle current = new ParticleTriangle();
    int anInt7103;
    int anInt7114;
    int anInt7113;
    int anInt7116;
    int anInt7117;
    boolean aBool7118;
    boolean unmoved;
    boolean aBool7107;
    ParticleEmitterConfig aClass87_7110;
    ParticleSystem parent;
    long startTime;
    ParticleProducerDefinition definition;
    EntityList particles;

    ParticleProducer(AbstractRenderer graphicalrenderer_1, ParticleEmitterConfig class87_2, ParticleSystem class539_3, long long_4) {
        aClass87_7110 = class87_2;
        parent = class539_3;
        startTime = long_4;
        definition = aClass87_7110.method1485();
        if (!graphicalrenderer_1.method8406() && definition.anInt573 != -1) {
            definition = Node_Sub11_Sub1.getParticleProducerDefs(definition.anInt573);
        }

        particles = new EntityList();
        anInt7103 = (int) (anInt7103 + Math.random() * 64.0D);
        updatePosition();
        aClass234_7109.anInt2888 = current.anInt2888;
        aClass234_7109.anInt2885 = current.anInt2885;
        aClass234_7109.anInt2886 = current.anInt2886;
        aClass234_7109.anInt2893 = current.anInt2893;
        aClass234_7109.anInt2895 = current.anInt2895;
        aClass234_7109.anInt2889 = current.anInt2889;
        aClass234_7109.anInt2890 = current.anInt2890;
        aClass234_7109.anInt2891 = current.anInt2891;
        aClass234_7109.anInt2884 = current.anInt2884;
    }

    public static void method11500(int i_0, boolean bool_1) {
        Class231.method3914(i_0, LocalizedText.LOADING_PLEASE_WAIT.translate(Class223.CURRENT_LANGUAGE), bool_1);
    }

    static void method11501() {
        CutsceneAction_Sub12.method14614(Renderers.SOFTWARE_RENDERER, client.CYCLES_20MS);
        if (client.BASE_WINDOW_ID != -1) {
            CS2Interface.method8777(client.BASE_WINDOW_ID);
        }

        int i_1;
        for (i_1 = 0; i_1 < client.anInt7407; i_1++) {
            client.aBoolArray7410[i_1] = client.aBoolArray7443[i_1];
            client.aBoolArray7443[i_1] = false;
        }

        client.anInt7408 = client.CYCLES_20MS;
        if (client.BASE_WINDOW_ID != -1) {
            client.anInt7407 = 0;
            StructIndexLoader.method7039();
        }

        Renderers.SOFTWARE_RENDERER.L();
        MaterialProp21.method15411(Renderers.SOFTWARE_RENDERER);
        i_1 = QuickchatFiller.method1141();
        if (i_1 == -1) {
            i_1 = client.anInt7427;
        }

        if (i_1 == -1) {
            i_1 = client.anInt7340;
        }

        UnderlayIndexLoader.method8036(i_1);
        client.anInt7261 = 0;
    }

    void method11493(AbstractRenderer graphicalrenderer_1, long long_2, int i_4, boolean bool_5) {
        boolean bool_51 = bool_5;
        int i_29;
        if (aBool7107) {
            bool_51 = false;
        } else if (Class235.anInt2906 < definition.minimumSetting) {
            bool_51 = false;
        } else if (Class235.anInt2903 > Class89.anIntArray934[Class235.anInt2906]) {
            bool_51 = false;
        } else if (unmoved) {
            bool_51 = false;
        } else if (definition.lifetime != -1) {
            i_29 = (int) (long_2 - startTime);
            if (!definition.periodic && i_29 > definition.lifetime) {
                bool_51 = false;
            } else {
                i_29 %= definition.lifetime;
            }

            if (!definition.activeFirst && i_29 < definition.anInt537) {
                bool_51 = false;
            }

            if (definition.activeFirst && i_29 >= definition.anInt537) {
                bool_51 = false;
            }
        }

        particleCount = 0;

        for (Particle class275_sub1_sub1_sub1_7 = (Particle) particles.method7659(); class275_sub1_sub1_sub1_7 != null; class275_sub1_sub1_sub1_7 = (Particle) particles.method7650()) {
            class275_sub1_sub1_sub1_7.method15967(i_4);
            ++particleCount;
        }

        if (bool_51) {
            i_29 = (current.anInt2890 + current.anInt2893 + current.anInt2888) / 3;
            int i_8 = (current.anInt2885 + current.anInt2895 + current.anInt2891) / 3;
            int i_9 = (current.anInt2886 + current.anInt2889 + current.anInt2884) / 3;
            int i_10;
            int i_11;
            int i_12;
            int i_13;
            int i_14;
            int i_15;
            int i_16;
            int i_17;
            int i_18;
            if (current.centerX != i_29 || current.centerZ != i_8 || current.centerY != i_9 || !aBool7118) {
                current.centerX = i_29;
                current.centerZ = i_8;
                current.centerY = i_9;
                i_10 = current.anInt2893 - current.anInt2888;
                i_11 = current.anInt2895 - current.anInt2885;
                i_12 = current.anInt2889 - current.anInt2886;
                i_13 = current.anInt2890 - current.anInt2888;
                i_14 = current.anInt2891 - current.anInt2885;
                i_15 = current.anInt2884 - current.anInt2886;
                anInt7108 = i_11 * i_15 - i_12 * i_14;
                anInt7111 = i_12 * i_13 - i_10 * i_15;
                anInt7112 = i_10 * i_14 - i_13 * i_11;

                while (true) {
                    if (anInt7108 <= 32767 && anInt7111 <= 32767 && anInt7112 <= 32767 && anInt7108 >= -32767 && anInt7111 >= -32767 && anInt7112 >= -32767) {
                        i_16 = (int) Math.sqrt(anInt7112 * anInt7112 + anInt7111 * anInt7111 + anInt7108 * anInt7108);
                        if (i_16 <= 0) {
                            i_16 = 1;
                        }

                        anInt7108 = anInt7108 * 32767 / i_16;
                        anInt7111 = anInt7111 * 32767 / i_16;
                        anInt7112 = anInt7112 * 32767 / i_16;
                        if (definition.maximumAngleH > 0 || definition.maximumAngleV > 0) {
                            i_17 = (int) (Math.atan2(anInt7112, anInt7108) * 2607.5945876176133D);
                            i_18 = (int) (Math.atan2(anInt7111, Math.sqrt(anInt7108 * anInt7108 + anInt7112 * anInt7112)) * 2607.5945876176133D);
                            anInt7114 = definition.maximumAngleH - definition.minimumAngleH;
                            anInt7113 = definition.minimumAngleH + i_17 - (anInt7114 >> 1);
                            anInt7116 = definition.maximumAngleV - definition.minimumAngleV;
                            anInt7117 = definition.minimumAngleV + i_18 - (anInt7116 >> 1);
                        }

                        aBool7118 = true;
                        break;
                    }

                    anInt7108 >>= 1;
                    anInt7111 >>= 1;
                    anInt7112 >>= 1;
                }
            }

            anInt7103 += (int) (i_4 * (definition.minimumParticleRate + Math.random() * (definition.maximumParticleRate - definition.minimumParticleRate)));
            if (anInt7103 > 63) {
                i_10 = anInt7103 >> 6;
                anInt7103 &= 0x3f;
                i_11 = (i_4 << 8) / i_10;
                i_12 = 0;

                for (i_13 = 0; i_13 < i_10; i_12 += i_11) {
                    int i_20;
                    int i_21;
                    int i_22;
                    if (definition.maximumAngleH <= 0 && definition.maximumAngleV <= 0) {
                        i_14 = anInt7108;
                        i_15 = anInt7111;
                        i_16 = anInt7112;
                    } else {
                        i_17 = anInt7113 + (int) (anInt7114 * Math.random());
                        i_17 &= 0x3fff;
                        i_18 = Class382.SINE[i_17];
                        int i_19 = Class382.COSINE[i_17];
                        i_20 = anInt7117 + (int) (anInt7116 * Math.random());
                        i_20 &= 0x1fff;
                        i_21 = Class382.SINE[i_20];
                        i_22 = Class382.COSINE[i_20];
                        byte b_23 = 13;
                        i_14 = i_19 * i_21 >> b_23;
                        i_15 = (i_22 << 1) * -1;
                        i_16 = i_21 * i_18 >> b_23;
                    }

                    float f_32 = (float) Math.random();
                    float f_33 = (float) Math.random();
                    if (f_32 + f_33 > 1.0F) {
                        f_32 = 1.0F - f_32;
                        f_33 = 1.0F - f_33;
                    }

                    float f_34 = 1.0F - (f_32 + f_33);
                    i_20 = (int) (f_33 * current.anInt2893 + current.anInt2888 * f_32 + f_34 * current.anInt2890);
                    i_21 = (int) (current.anInt2895 * f_33 + current.anInt2885 * f_32 + current.anInt2891 * f_34);
                    i_22 = (int) (f_34 * current.anInt2884 + current.anInt2886 * f_32 + f_33 * current.anInt2889);
                    int i_35 = definition.minimumSpeed + (int) (Math.random() * (definition.maximumSpeed - definition.minimumSpeed));
                    int i_24 = definition.minimumLifetime + (int) (Math.random() * (definition.maximumLifetime - definition.minimumLifetime));
                    int i_25 = definition.minimumSize + (int) (Math.random() * (definition.maximumSize - definition.minimumSize));
                    int i_26;
                    if (definition.uniformColorVariance) {
                        double d_27 = Math.random();
                        i_26 = (int) (d_27 * definition.anInt581 + definition.anInt565) << 16 | (int) (definition.anInt551 + d_27 * definition.anInt584) << 8 | (int) (definition.anInt585 + d_27 * definition.anInt587) | (int) (definition.anInt588 + Math.random() * definition.anInt590) << 24;
                    } else {
                        i_26 = (int) (definition.anInt565 + Math.random() * definition.anInt581) << 16 | (int) (definition.anInt551 + Math.random() * definition.anInt584) << 8 | (int) (definition.anInt585 + Math.random() * definition.anInt587) | (int) (definition.anInt588 + Math.random() * definition.anInt590) << 24;
                    }

                    int spriteId = definition.textureId;
                    if (!graphicalrenderer_1.method8406() && !definition.aBool574) {
                        spriteId = -1;
                    }

                    Particle class275_sub1_sub1_sub1_28;
                    if (Class235.anInt2905 != Class235.anInt2902) {
                        class275_sub1_sub1_sub1_28 = Class235.aEntityNode_Sub1_Sub1_Sub1Array2897[Class235.anInt2902];
                        Class235.anInt2902 = Class235.anInt2902 + 1 & 0x3ff;
                        class275_sub1_sub1_sub1_28.reset(this, i_20, i_21, i_22, i_14, i_15, i_16, i_35, i_24, i_26, i_25, spriteId, definition.aBool534);
                    } else {
                        class275_sub1_sub1_sub1_28 = new Particle(this, i_20, i_21, i_22, i_14, i_15, i_16, i_35, i_24, i_26, i_25, spriteId, definition.aBool534);
                    }

                    if (i_12 > 256) {
                        class275_sub1_sub1_sub1_28.method15967(i_12 >> 8);
                    }

                    ++particleCount;
                    ++i_13;
                }
            }
        }

        if (!current.equals(aClass234_7109)) {
            ParticleTriangle triangle = aClass234_7109;
            aClass234_7109 = current;
            current = triangle;
            current.anInt2888 = aClass87_7110.anInt844;
            current.anInt2885 = aClass87_7110.anInt841;
            current.anInt2886 = aClass87_7110.anInt847;
            current.anInt2893 = aClass87_7110.anInt834;
            current.anInt2895 = aClass87_7110.anInt843;
            current.anInt2889 = aClass87_7110.anInt845;
            current.anInt2890 = aClass87_7110.anInt846;
            current.anInt2891 = aClass87_7110.anInt840;
            current.anInt2884 = aClass87_7110.anInt848;
            current.centerX = aClass234_7109.centerX;
            current.centerZ = aClass234_7109.centerZ;
            current.centerY = aClass234_7109.centerY;
        }

        Class235.anInt2900 += particleCount;
    }

    void updatePosition() {
        current.anInt2888 = aClass87_7110.anInt844;
        current.anInt2885 = aClass87_7110.anInt841;
        current.anInt2886 = aClass87_7110.anInt847;
        current.anInt2893 = aClass87_7110.anInt834;
        current.anInt2895 = aClass87_7110.anInt843;
        current.anInt2889 = aClass87_7110.anInt845;
        current.anInt2890 = aClass87_7110.anInt846;
        current.anInt2891 = aClass87_7110.anInt840;
        current.anInt2884 = aClass87_7110.anInt848;
        if (current.anInt2893 == current.anInt2888 && current.anInt2893 == current.anInt2890 && current.anInt2885 == current.anInt2895 && current.anInt2895 == current.anInt2891 && current.anInt2889 == current.anInt2886 && current.anInt2889 == current.anInt2884) {
            unmoved = true;
        } else if (unmoved) {
            unmoved = false;
            aClass234_7109.anInt2888 = current.anInt2888;
            aClass234_7109.anInt2885 = current.anInt2885;
            aClass234_7109.anInt2886 = current.anInt2886;
            aClass234_7109.anInt2893 = current.anInt2893;
            aClass234_7109.anInt2895 = current.anInt2895;
            aClass234_7109.anInt2889 = current.anInt2889;
            aClass234_7109.anInt2890 = current.anInt2890;
            aClass234_7109.anInt2891 = current.anInt2891;
            aClass234_7109.anInt2884 = current.anInt2884;
        }

    }

    void method11496(SceneObjectManager sceneobjectmanager_1, AbstractRenderer graphicalrenderer_2) {
        for (Particle class275_sub1_sub1_sub1_5 = (Particle) particles.method7659(); class275_sub1_sub1_sub1_5 != null; class275_sub1_sub1_sub1_5 = (Particle) particles.method7650()) {
            class275_sub1_sub1_sub1_5.method15965(sceneobjectmanager_1, graphicalrenderer_2);
        }

    }

}
