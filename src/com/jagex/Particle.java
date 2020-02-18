package com.jagex;

import java.util.Iterator;

public class Particle extends PointEntity {

    short aShort10425;
    ParticleProducer producer;
    short lifetime;
    short lifespan;
    short aShort10431;
    short aShort10424;
    short aShort10430;
    int speed;
    int intermediateColour;

    Particle(ParticleProducer class538_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, int i_11, int i_12, boolean bool_14) {
        producer = class538_1;
        x = i_2 << 12;
        z = i_3 << 12;
        y = i_4 << 12;
        color = i_10;
        lifespan = lifetime = (short) i_9;
        size = i_11;
        rotation = i_12;
        aBool10210 = bool_14;
        aShort10431 = (short) i_5;
        aShort10424 = (short) i_6;
        aShort10430 = (short) i_7;
        speed = i_8;
        aByte10211 = producer.aClass87_7110.priority;
        link();
    }

    void link() {
        int index = producer.parent.size;
        if (producer.parent.particles[index] != null) {
            producer.parent.particles[index].kill();
        }

        producer.parent.particles[index] = this;
        aShort10425 = (short) producer.parent.size;
        producer.parent.size = index + 1 & 0x1fff;
        producer.particles.offer(this);
    }

    void reset(ParticleProducer emitter, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, int i_11, int i_12, boolean bool_14) {
        producer = emitter;
        x = i_2 << 12;
        z = i_3 << 12;
        y = i_4 << 12;
        color = i_10;
        lifespan = lifetime = (short) i_9;
        size = i_11;
        rotation = i_12;
        aBool10210 = bool_14;
        aShort10431 = (short) i_5;
        aShort10424 = (short) i_6;
        aShort10430 = (short) i_7;
        speed = i_8;
        aByte10211 = producer.aClass87_7110.priority;
        link();
    }

    void kill() {
        producer.parent.particles[aShort10425] = null;
        Class235.aEntityNode_Sub1_Sub1_Sub1Array2897[Class235.anInt2905] = this;
        Class235.anInt2905 = Class235.anInt2905 + 1 & 0x3ff;
        method4887();
        method12423();
    }

    void method15965(SceneObjectManager sceneobjectmanager_1, AbstractRenderer graphicalrenderer_2) {
        int i_5 = x >> sceneobjectmanager_1.anInt2592 + 12;
        int i_6 = y >> sceneobjectmanager_1.anInt2592 + 12;
        int i_7 = z >> 12;
        if (i_7 <= 0 && i_7 >= -262144 && i_5 >= 0 && i_5 < sceneobjectmanager_1.sizeX && i_6 >= 0 && i_6 < sceneobjectmanager_1.sizeY) {
            ParticleSystem class539_8 = producer.parent;
            ParticleProducerDefinition class59_9 = producer.definition;
            Ground[] arr_10 = sceneobjectmanager_1.aGroundArray2591;
            int i_11 = class539_8.anInt7122;
            Class293 class293_12 = sceneobjectmanager_1.aClass293ArrayArrayArray2604[class539_8.anInt7122][i_5][i_6];
            if (class293_12 != null) {
                i_11 = class293_12.aByte3507;
            }

            int i_13 = arr_10[i_11].getHeight(i_5, i_6);
            int i_14;
            if (i_11 < sceneobjectmanager_1.anInt2601 - 1) {
                i_14 = arr_10[i_11 + 1].getHeight(i_5, i_6);
            } else {
                i_14 = i_13 - (8 << sceneobjectmanager_1.anInt2592);
            }

            if (class59_9.aBool578) {
                if (class59_9.anInt591 == -1 && i_7 > i_13) {
                    kill();
                    return;
                }

                if (class59_9.anInt591 >= 0 && i_7 > arr_10[class59_9.anInt591].getHeight(i_5, i_6)) {
                    kill();
                    return;
                }

                if (class59_9.anInt600 == -1 && i_7 < i_14) {
                    kill();
                    return;
                }

                if (class59_9.anInt600 >= 0 && i_7 < arr_10[class59_9.anInt600 + 1].getHeight(i_5, i_6)) {
                    kill();
                    return;
                }
            }

            int i_15;
            for (i_15 = sceneobjectmanager_1.anInt2601 - 1; i_15 > 0 && i_7 > arr_10[i_15].getHeight(i_5, i_6); --i_15) {
            }

            if (class59_9.aBool541 && i_15 == 0 && i_7 > arr_10[0].getHeight(i_5, i_6)) {
                kill();
            } else if (i_15 == sceneobjectmanager_1.anInt2601 - 1 && arr_10[i_15].getHeight(i_5, i_6) - i_7 > 8 << sceneobjectmanager_1.anInt2592) {
                kill();
            } else {
                class293_12 = sceneobjectmanager_1.aClass293ArrayArrayArray2604[i_15][i_5][i_6];
                int i_17;
                if (class293_12 == null) {
                    if (i_15 == 0 || sceneobjectmanager_1.aClass293ArrayArrayArray2604[0][i_5][i_6] == null) {
                        class293_12 = sceneobjectmanager_1.aClass293ArrayArrayArray2604[0][i_5][i_6] = new Class293(0);
                    }

                    boolean bool_16 = sceneobjectmanager_1.aClass293ArrayArrayArray2604[0][i_5][i_6].aClass293_3509 != null;
                    if (i_15 == 3 && bool_16) {
                        kill();
                        return;
                    }

                    for (i_17 = 1; i_17 <= i_15; i_17++) {
                        if (sceneobjectmanager_1.aClass293ArrayArrayArray2604[i_17][i_5][i_6] == null) {
                            class293_12 = sceneobjectmanager_1.aClass293ArrayArrayArray2604[i_17][i_5][i_6] = new Class293(i_17);
                            if (bool_16) {
                                ++class293_12.aByte3507;
                            }
                        }
                    }
                }

                if (class59_9.aBool576) {
                    int i_20 = x >> 12;
                    i_17 = y >> 12;
                    Class200 class200_18;
                    if (class293_12.aTransform_Sub1_Sub5_3505 != null) {
                        class200_18 = class293_12.aTransform_Sub1_Sub5_3505.method12992(graphicalrenderer_2);
                        if (class200_18 != null && class200_18.method3255(i_20, i_7, i_17)) {
                            kill();
                            return;
                        }
                    }

                    if (class293_12.aTransform_Sub1_Sub5_3502 != null) {
                        class200_18 = class293_12.aTransform_Sub1_Sub5_3502.method12992(graphicalrenderer_2);
                        if (class200_18 != null && class200_18.method3255(i_20, i_7, i_17)) {
                            kill();
                            return;
                        }
                    }

                    if (class293_12.aTransform_Sub1_Sub3_3499 != null) {
                        class200_18 = class293_12.aTransform_Sub1_Sub3_3499.method12992(graphicalrenderer_2);
                        if (class200_18 != null && class200_18.method3255(i_20, i_7, i_17)) {
                            kill();
                            return;
                        }
                    }

                    for (Class208 class208_21 = class293_12.aClass208_3504; class208_21 != null; class208_21 = class208_21.aClass208_2660) {
                        Class200 class200_19 = class208_21.aTransform_Sub1_Sub1_2659.method12992(graphicalrenderer_2);
                        if (class200_19 != null && class200_19.method3255(i_20, i_7, i_17)) {
                            kill();
                            return;
                        }
                    }
                }

                class539_8.aClass151_7131.aClass464_1961.method7735(this);
            }
        } else {
            kill();
        }

    }

    void method15967(int delta) {
        lifetime -= delta;
        if (lifetime <= 0) {
            kill();
        } else {
            int tileX = x >> 12;
            int tileZ = z >> 12;
            int plane = y >> 12;
            ParticleSystem system = producer.parent;
            ParticleProducerDefinition definition = producer.definition;
            if (definition.fadeColor != 0) {
                if (lifespan - lifetime <= definition.colorFadeStart) {
                    int r = delta * definition.fadeRedStep + (intermediateColour >> 16 & 0xff) + (color >> 8 & 0xff00);
                    int g = delta * definition.fadeGreenStep + (color & 0xff00) + (intermediateColour >> 8 & 0xff);
                    int b = delta * definition.fadeBlueStep + (color << 8 & 0xff00) + (intermediateColour & 0xff);
                    if (r < 0) {
                        r = 0;
                    } else if (r > 65535) {
                        r = 65535;
                    }

                    if (g < 0) {
                        g = 0;
                    } else if (g > 65535) {
                        g = 65535;
                    }

                    if (b < 0) {
                        b = 0;
                    } else if (b > 65535) {
                        b = 65535;
                    }

                    color &= -16777216;
                    color |= (g & 0xff00) + ((b & 0xff00) >> 8) + ((r & 0xff00) << 8);
                    intermediateColour &= -16777216;
                    intermediateColour |= (b & 0xff) + ((r & 0xff) << 16) + ((g & 0xff) << 8);
                }

                if (lifespan - lifetime <= definition.alphaFadeStart) {
                    int a = delta * definition.fadeAlphaStep + (intermediateColour >> 24 & 0xff) + (color >> 16 & 0xff00);
                    if (a < 0) {
                        a = 0;
                    } else if (a > 65535) {
                        a = 65535;
                    }

                    color &= 0xffffff;
                    color |= (a & 0xff00) << 16;
                    intermediateColour &= 0xffffff;
                    intermediateColour |= (a & 0xff) << 24;
                }
            }

            if (definition.endSpeed != -1 && lifespan - lifetime <= definition.startSpeedChange) {
                speed += definition.speedStep * delta;
            }

            if (definition.endSize != -1 && lifespan - lifetime <= definition.startSizeChange) {
                size += definition.sizeChangeStep * delta;
            }

            double directionX = aShort10431;
            double directionZ = aShort10424;
            double directionY = aShort10430;
            boolean bool_15 = false;
            int dx;
            int dz;
            int dy;
            int i_19;
            long long_20;
            if (definition.anInt542 == 1) {
                dx = tileX - producer.current.centerX;
                dz = tileZ - producer.current.centerZ;
                dy = plane - producer.current.centerY;
                i_19 = (int) Math.sqrt(dx * dx + dz * dz + dy * dy) >> 2;
                long_20 = delta * i_19 * definition.anInt569;
                speed = (int) (speed - (speed * long_20 >> 18));
            } else if (definition.anInt542 == 2) {
                dx = tileX - producer.current.centerX;
                dz = tileZ - producer.current.centerZ;
                dy = plane - producer.current.centerY;
                i_19 = dx * dx + dz * dz + dy * dy;
                long_20 = delta * i_19 * definition.anInt569;
                speed = (int) (speed - (speed * long_20 >> 28));
            }

            Node_Sub40 class282_sub40_45;
            ParticleArchive1Def class345_46;
            if (definition.anIntArray559 != null) {
                Iterator<Node_Sub40> iterator_44 = system.aList7127.iterator();

                label218:
                while (true) {
                    do {
                        if (!iterator_44.hasNext()) {
                            break label218;
                        }

                        class282_sub40_45 = iterator_44.next();
                        class345_46 = class282_sub40_45.aClass345_8007;
                    } while (class345_46.anInt4041 == 1);

                    boolean found = false;

                    for (int i_47 = 0; i_47 < definition.anIntArray559.length; i_47++) {
                        if (class345_46.anInt4032 == definition.anIntArray559[i_47]) {
                            found = true;
                            break;
                        }
                    }

                    if (found) {
                        double d_51 = tileX - class282_sub40_45.anInt8010;
                        double d_22 = tileZ - class282_sub40_45.anInt8006;
                        double d_24 = plane - class282_sub40_45.anInt8008;
                        double d_26 = d_51 * d_51 + d_22 * d_22 + d_24 * d_24;
                        if (d_26 <= class345_46.aLong4044) {
                            double d_28 = Math.sqrt(d_26);
                            if (d_28 == 0.0D) {
                                d_28 = 1.0D;
                            }

                            double d_30 = (d_51 * class282_sub40_45.aFloat8011 + d_22 * class345_46.anInt4036 + d_24 * class282_sub40_45.aFloat8012) * 65535.0D / (class345_46.anInt4033 * d_28);
                            if (d_30 >= class345_46.anInt4024) {
                                double d_32 = 0.0D;
                                if (class345_46.anInt4038 == 1) {
                                    d_32 = d_28 / 16.0D * class345_46.anInt4035;
                                } else if (class345_46.anInt4038 == 2) {
                                    d_32 = d_28 / 16.0D * (d_28 / 16.0D) * class345_46.anInt4035;
                                }

                                if (class345_46.anInt4039 == 0) {
                                    if (class345_46.anInt4040 == 0) {
                                        directionX += (class282_sub40_45.aFloat8011 - d_32) * delta;
                                        directionZ += (class345_46.anInt4036 - d_32) * delta;
                                        directionY += (class282_sub40_45.aFloat8012 - d_32) * delta;
                                        bool_15 = true;
                                    } else {
                                        x = (int) (x + (class282_sub40_45.aFloat8011 - d_32) * delta);
                                        z = (int) (z + (class345_46.anInt4036 - d_32) * delta);
                                        y = (int) (y + (class282_sub40_45.aFloat8012 - d_32) * delta);
                                    }
                                } else {
                                    double d_34 = d_51 / d_28 * class345_46.anInt4033;
                                    double d_36 = d_22 / d_28 * class345_46.anInt4033;
                                    double d_38 = d_24 / d_28 * class345_46.anInt4033;
                                    if (class345_46.anInt4040 == 0) {
                                        directionX += d_34 * delta;
                                        directionZ += d_36 * delta;
                                        directionY += d_38 * delta;
                                        bool_15 = true;
                                    } else {
                                        x = (int) (x + d_34 * delta);
                                        z = (int) (z + d_36 * delta);
                                        y = (int) (y + d_38 * delta);
                                    }
                                }
                            }
                        }
                    }
                }
            }

            if (definition.anIntArray582 != null) {
                for (dx = 0; dx < definition.anIntArray582.length; dx++) {
                    class282_sub40_45 = (Node_Sub40) Class235.aClass465_2904.get(definition.anIntArray582[dx]);

                    while (class282_sub40_45 != null) {
                        class345_46 = class282_sub40_45.aClass345_8007;
                        double d_48 = tileX - class282_sub40_45.anInt8010;
                        double d_21 = tileZ - class282_sub40_45.anInt8006;
                        double d_23 = plane - class282_sub40_45.anInt8008;
                        double d_25 = d_48 * d_48 + d_21 * d_21 + d_23 * d_23;
                        if (d_25 > class345_46.aLong4044) {
                            class282_sub40_45 = (Node_Sub40) Class235.aClass465_2904.method7747();
                        } else {
                            double d_27 = Math.sqrt(d_25);
                            if (d_27 == 0.0D) {
                                d_27 = 1.0D;
                            }

                            double d_29 = (d_48 * class282_sub40_45.aFloat8011 + d_21 * class345_46.anInt4036 + d_23 * class282_sub40_45.aFloat8012) * 65535.0D / (class345_46.anInt4033 * d_27);
                            if (d_29 < class345_46.anInt4024) {
                                class282_sub40_45 = (Node_Sub40) Class235.aClass465_2904.method7747();
                            } else {
                                double d_31 = 0.0D;
                                if (class345_46.anInt4038 == 1) {
                                    d_31 = d_27 / 16.0D * class345_46.anInt4035;
                                } else if (class345_46.anInt4038 == 2) {
                                    d_31 = d_27 / 16.0D * (d_27 / 16.0D) * class345_46.anInt4035;
                                }

                                if (class345_46.anInt4039 == 0) {
                                    if (class345_46.anInt4040 == 0) {
                                        directionX += (class282_sub40_45.aFloat8011 - d_31) * delta;
                                        directionZ += (class345_46.anInt4036 - d_31) * delta;
                                        directionY += (class282_sub40_45.aFloat8012 - d_31) * delta;
                                        bool_15 = true;
                                    } else {
                                        x = (int) (x + (class282_sub40_45.aFloat8011 - d_31) * delta);
                                        z = (int) (z + (class345_46.anInt4036 - d_31) * delta);
                                        y = (int) (y + (class282_sub40_45.aFloat8012 - d_31) * delta);
                                    }
                                } else {
                                    double d_33 = d_48 / d_27 * class345_46.anInt4033;
                                    double d_35 = d_21 / d_27 * class345_46.anInt4033;
                                    double d_37 = d_23 / d_27 * class345_46.anInt4033;
                                    if (class345_46.anInt4040 == 0) {
                                        directionX += d_33 * delta;
                                        directionZ += d_35 * delta;
                                        directionY += d_37 * delta;
                                        bool_15 = true;
                                    } else {
                                        x = (int) (x + d_33 * delta);
                                        z = (int) (z + d_35 * delta);
                                        y = (int) (y + d_37 * delta);
                                    }
                                }

                                class282_sub40_45 = (Node_Sub40) Class235.aClass465_2904.method7747();
                            }
                        }
                    }
                }
            }

            if (definition.anIntArray561 != null) {
                if (definition.anIntArray562 == null) {
                    definition.anIntArray562 = new int[definition.anIntArray561.length];

                    for (dx = 0; dx < definition.anIntArray561.length; dx++) {
                        Class423.method7065(definition.anIntArray561[dx]);
                        definition.anIntArray562[dx] = ((IntNode) ParticleArchive1Def.aClass465_4029.get(definition.anIntArray561[dx])).value;
                    }
                }

                for (dx = 0; dx < definition.anIntArray562.length; dx++) {
                    ParticleArchive1Def class345_52 = ParticleArchive1Def.aClass345Array4025[definition.anIntArray562[dx]];
                    if (class345_52.anInt4040 == 0) {
                        directionX += delta * class345_52.anInt4027;
                        directionZ += delta * class345_52.anInt4036;
                        directionY += delta * class345_52.anInt4037;
                        bool_15 = true;
                    } else {
                        x += class345_52.anInt4027 * delta;
                        z += class345_52.anInt4036 * delta;
                        y += class345_52.anInt4037 * delta;
                    }
                }
            }

            if (bool_15) {
                while (true) {
                    if (directionX <= 32767.0D && directionZ <= 32767.0D && directionY <= 32767.0D && directionX >= -32767.0 && directionZ >= -32767.0 && directionY >= -32767.0) {
                        aShort10431 = (short) ((int) directionX);
                        aShort10424 = (short) ((int) directionZ);
                        aShort10430 = (short) ((int) directionY);
                        break;
                    }

                    directionX /= 2.0D;
                    directionZ /= 2.0D;
                    directionY /= 2.0D;
                    speed <<= 1;
                }
            }

            x = (int) (x + ((long) aShort10431 * (speed << 2) >> 23) * delta);
            z = (int) (z + ((long) aShort10424 * (speed << 2) >> 23) * delta);
            y = (int) (y + ((long) aShort10430 * (speed << 2) >> 23) * delta);
        }

    }

}
